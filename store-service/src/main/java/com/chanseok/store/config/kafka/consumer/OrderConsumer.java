package com.chanseok.store.config.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderConsumer {

    @KafkaListener(topics = "ORDER-TOPIC", groupId = "kafka-consumer-group")
    public void listen(String message) {
        log.info("kafka message ===> {}", message);
    }
}
