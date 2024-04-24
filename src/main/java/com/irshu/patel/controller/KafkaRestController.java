package com.irshu.patel.controller;

import com.irshu.patel.service.ProducerService;
import com.irshu.patel.util.MessageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {

    @Autowired
    private ProducerService producerService;

    @Autowired
    private MessageStore messageStore;

    @GetMapping(path = "send")
    public String sendMessage(@RequestParam String message){
        producerService.sendMessage(message);
        return "Success";
    }

    @GetMapping(path = "getAllMessages")
    public String getAllMessages(){
        return messageStore.viewAllMessages();
    }
}
