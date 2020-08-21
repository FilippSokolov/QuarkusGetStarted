package org.acme.getting.started;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "prefix")
public class ExampleProperties {
    public MyBean bean;

    public static class MyBean {
        public String string;
        public MyBean bean;
    }
}