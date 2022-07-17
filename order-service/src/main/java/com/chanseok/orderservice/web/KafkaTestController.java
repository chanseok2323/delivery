package com.chanseok.orderservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaTestController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/kafka/test")
    public void kafka() {
        kafkaTemplate.send("ORDER-TOPIC", "박찬석 입니다.");
    }
}
