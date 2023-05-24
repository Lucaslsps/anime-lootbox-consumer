package com.animelootboxconsumer.Listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListenerImpl implements CharacterListener{

    @KafkaListener(topics = "anime-topic", groupId = "meu-grupo")
    public void consumer(final String message) throws JsonProcessingException {
        log.info(message);
    }
}
