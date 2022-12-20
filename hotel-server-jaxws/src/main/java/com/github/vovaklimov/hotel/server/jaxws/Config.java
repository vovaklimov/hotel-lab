package com.github.vovaklimov.hotel.server.jaxws;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class Config {
    private static final Properties properties = new Properties();

    static {
        try (InputStream in = ClassLoader.getSystemResourceAsStream("config.properties")) {
            properties.load(in);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read properties from config.properties", e);
        }
    }

    static {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
    }

    static String getBaseUrl() {
        return properties.getProperty("BASE_URL");
    }
}
