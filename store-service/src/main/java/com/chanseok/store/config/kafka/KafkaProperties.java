package com.chanseok.store.config.kafka;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
@ConfigurationProperties(prefix = "spring.kafka.consumer")
public class KafkaProperties {
    private String groupId;
    private String bootstrapServers;
}
