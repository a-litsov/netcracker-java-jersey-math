package com.netcracker.adlitsov;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

public class CalculationRestClient {
    private static final Random RND = new Random();
    private static final String ROOT_PATH = "http://localhost:8080/rest/calc";
    private static final String[] mediaTypes = {MediaType.TEXT_PLAIN, MediaType.TEXT_XML};

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget rootTarget = client.target(ROOT_PATH);
        String paramsPath = RND.nextDouble() + "/" + RND.nextDouble();
        System.out.println("Params: " + paramsPath);

        // Add tests
        System.out.println("--- Add responses: ---");
        WebTarget addTarget = rootTarget.path("add/" + paramsPath);
        doWithTarget(addTarget);

        // Sub tests
        System.out.println("--- Sub responses: ---");
        WebTarget subTarget = rootTarget.path("sub/" + paramsPath);
        doWithTarget(subTarget);

        // Mult tests
        System.out.println("--- Mult responses: ---");
        WebTarget multTarget = rootTarget.path("mult/" + paramsPath);
        doWithTarget(multTarget);

        // Div tests
        System.out.println("--- Div responses: ---");
        WebTarget divTarget = rootTarget.path("div/" + paramsPath);
        doWithTarget(divTarget);
    }

    private static void doWithTarget(WebTarget target) {
        for (String mediaType : mediaTypes) {
            Response resp = target.request(mediaType).get();
            System.out.println(resp.getMediaType() + ", body: " + resp.readEntity(String.class));
        }
    }
}
