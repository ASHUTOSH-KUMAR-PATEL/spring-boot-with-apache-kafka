package com.irshu.patel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${my.kafka.topic.name}")
    private String topicName;

    public void sendMessage(String message){
        System.out.println("FROM PRODUCER => "+message);
        kafkaTemplate.send(topicName, message);
    }
}
