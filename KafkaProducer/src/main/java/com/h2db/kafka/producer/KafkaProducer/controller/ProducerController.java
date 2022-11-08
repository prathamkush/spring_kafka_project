package com.h2db.kafka.producer.KafkaProducer.controller;


import com.h2db.kafka.producer.KafkaProducer.model.MessageModel;
import com.h2db.kafka.producer.KafkaProducer.model.UserModel;
import com.h2db.kafka.producer.KafkaProducer.producer.TopicProducer;
import com.h2db.kafka.producer.KafkaProducer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka/producer")
public class ProducerController {

    private final TopicProducer topicProducer;
    @Autowired
    private MessageService service;

    @GetMapping("/send/{name}")
    public void send(@PathVariable("name") String name){
        topicProducer.send("Hello "+name);
    }

    @PostMapping("/send-with-body")
    public void sendWithBody(@RequestBody Map<String, Object> body){
        topicProducer.sendWithBody(body);
    }

    @PostMapping("/send-user")
    public UserModel sendUser(@RequestBody UserModel user){
        topicProducer.send(user.toString());
        return user;
    }


    @PostMapping("/send-message")
    public MessageModel sendMessage(@RequestBody MessageModel message){
        topicProducer.send(message.toString());
        MessageModel tempMessage = service.addMessage(message);
        return tempMessage;
    }



}
