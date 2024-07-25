package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Chat;
import com.example.demo.repository.ChatRepository;

@Service
public class ChatService {
    
    @Autowired
    ChatRepository repository;

    public List<Chat> getChatMessages(String sender, String recipient) {
        return repository.findbySenderAndRecipient(sender, recipient);
    }
}
