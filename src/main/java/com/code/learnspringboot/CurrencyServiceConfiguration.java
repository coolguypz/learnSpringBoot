package com.code.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// currency-service.url =
// currency-service.user-name =
// currency-service.key =

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
    private String url;
    private String user_name;
    private String key;

    public String getUrl() {
        return url;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getKey() {
        return key;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
