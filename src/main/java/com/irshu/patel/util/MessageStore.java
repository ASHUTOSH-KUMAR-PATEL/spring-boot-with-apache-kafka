package com.irshu.patel.util;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class MessageStore {

    private List<String> messageList = new ArrayList<>();

    public void addMessage(String message){
        messageList.add(message);
    }

    public String viewAllMessages(){
        return messageList.toString();
    }
}
