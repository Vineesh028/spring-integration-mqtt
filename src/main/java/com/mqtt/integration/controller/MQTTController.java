package com.mqtt.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mqtt.integration.config.MQTTProperties;
import com.mqtt.integration.service.MQTTGateway;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/mqttservice")
public class MQTTController {

	@Autowired
	private MQTTGateway mqttGateway;
	
	@Autowired
	private MQTTProperties mqttProp;

	@PostMapping("/send/{message}")
	public HttpStatus sendMsg(@PathVariable String message) {
		log.info("Sending message : {}  ", message);
		mqttGateway.sendMessage(message,mqttProp.getDefaultTopic());
		return HttpStatus.OK;
	}
}
