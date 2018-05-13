package com.netcracker.adlitsov;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calc")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class CalculationRestService {

    // Add handling methods
    @GET
    @Path("/add/{a}/{b}")
    public String add(@PathParam("a") double a, @PathParam("b") double b) {
        return Double.toString(a + b);
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    @Path("/add/{a}/{b}")
    public String addAsXML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeXML(a + b);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/add/{a}/{b}")
    public String addAsHTML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeHTML(a + b);
    }

    // Sub handling methods
    @GET
    @Path("/sub/{a}/{b}")
    public String sub(@PathParam("a") double a, @PathParam("b") double b) {
        return Double.toString(a - b);
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    @Path("/sub/{a}/{b}")
    public String subAsXML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeXML(a - b);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/sub/{a}/{b}")
    public String subAsHTML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeHTML(a - b);
    }

    // Mult handling methods
    @GET
    @Path("/mult/{a}/{b}")
    public String mult(@PathParam("a") double a, @PathParam("b") double b) {
        return Double.toString(a * b);
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    @Path("/mult/{a}/{b}")
    public String multAsXML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeXML(a * b);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/mult/{a}/{b}")
    public String multAsHTML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeHTML(a * b);
    }

    // Div handling methods
    @GET
    @Path("/div/{a}/{b}")
    public String div(@PathParam("a") double a, @PathParam("b") double b) {
        return Double.toString(a / b);
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    @Path("/div/{a}/{b}")
    public String divAsXML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeXML(a / b);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/div/{a}/{b}")
    public String divAsHTML(@PathParam("a") double a, @PathParam("b") double b) {
        return Formatter.makeHTML(a / b);
    }
}
