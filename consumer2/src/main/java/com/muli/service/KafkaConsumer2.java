package com.muli.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer2 {
    @KafkaListener(topics = "world", groupId = "smartscore2")
    public void consumer(String message) {
         System.out.println(String.format("Consumed message : %s", message));
    }

}
