package com.chanseok.restaurantservice.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class KafkaTestController {

    @KafkaListener(topics = "ORDER-TOPIC", groupId = "kafka-consumer-group")
    public void listen(String message) {
        log.info("message = {}", message);
    }
}
