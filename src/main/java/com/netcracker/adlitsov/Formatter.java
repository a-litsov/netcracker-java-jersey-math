package com.netcracker.adlitsov;

public class Formatter {
    public static String makeXML(double value) {
        StringBuilder xml = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xml.append("<result>").append(Double.toString(value)).append("</result>");
        return xml.toString();
    }

    public static String makeHTML(double value) {
        return new StringBuilder("<html><body>").append(Double.toString(value))
                                                .append("</body></html>").toString();
    }
}
