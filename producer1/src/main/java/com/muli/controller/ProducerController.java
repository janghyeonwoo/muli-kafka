package com.muli.controller;

import com.muli.service.KafkaProducer1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProducerController {

    private final KafkaProducer1 kafkaProducer1;

    @PostMapping(value = "/test")
    public void TestSendMessage(@RequestBody(required = true) String message) {
        this.kafkaProducer1.sendMessage(message);
    }
}
