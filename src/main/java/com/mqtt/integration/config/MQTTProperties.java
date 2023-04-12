package com.mqtt.integration.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("mqtt")
public class MQTTProperties {
    private String username;
    private String password;
    private String[] hostUrl;
    private String clientId;
    private String defaultTopic;
    private Long connectionTimeout;
    private String[] subscriptionTopic;
}
