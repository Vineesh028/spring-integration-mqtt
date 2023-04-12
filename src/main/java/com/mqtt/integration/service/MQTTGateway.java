package com.mqtt.integration.service;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;


@MessagingGateway(defaultRequestChannel = "mqttOutputChannel")
public interface MQTTGateway {
    void sendMessage(String message, @Header(MqttHeaders.TOPIC) String topic);
}
