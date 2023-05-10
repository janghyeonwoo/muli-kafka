package com.muli.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer1 {

    @KafkaListener(topics = "world", groupId = "smartscore")
    public void consumer(String message) {
         System.out.println(String.format("Consumed message : %s", message));
    }
}
