package com.zamora.microservicio.eureka;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("microservicioeurekas")
@org.springframework.context.annotation.Configuration
public class Configuration {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

