package com.example.demo.controller;

import com.example.demo.body.ChatModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatModel sendMessage(@Payload ChatModel chatMessage) {
        return chatMessage;
    }
}