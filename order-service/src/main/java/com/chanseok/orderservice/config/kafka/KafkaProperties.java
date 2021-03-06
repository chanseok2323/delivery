package com.chanseok.orderservice.config.kafka;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ConfigurationProperties(prefix = "spring.kafka.consumer")
public class KafkaProperties {
    private String groupId;
    private String bootstrapServers;
}
