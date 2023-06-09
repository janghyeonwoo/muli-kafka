package com.muli.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class KafkaProducer1 {
    @Value("${test.topic}")
    private String TOPIC;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info(String.format("Produce message(test) : %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}
