package com.yudhir.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test",
            groupId = "group_id")

    // Method
    public void consume(String message) {
        // Print statement
        System.out.println("message = " + message);
    }
}
