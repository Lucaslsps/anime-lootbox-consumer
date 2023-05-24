package com.animelootboxconsumer.Listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.common.protocol.Message;

public interface CharacterListener {
    void consumer(String message) throws JsonProcessingException;
}
