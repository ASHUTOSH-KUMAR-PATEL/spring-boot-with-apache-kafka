package com.irshu.patel.service;

import com.irshu.patel.util.MessageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Autowired
    private MessageStore messageStore;

    @KafkaListener(topics = "${my.kafka.topic.name}", groupId = "${my.kafka.group.name}")
    public void readMessage(String message) {
        System.out.println("FROM CONSUMER => "+message);
        messageStore.addMessage(message);
    }
}
