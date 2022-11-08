package com.h2db.kafka.consumer.KafkaConsumer.controller;


import com.h2db.kafka.consumer.KafkaConsumer.consumer.TopicConsumer;
import com.h2db.kafka.consumer.KafkaConsumer.model.MessageModel;
import com.h2db.kafka.consumer.KafkaConsumer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka/consumer")
public class ConsumerController {

    private final TopicConsumer topicConsumer;

    @Autowired
    MessageService service;


    @GetMapping("/consume")
    public String consume(){
        return topicConsumer.getLatest_consume();
    }


    @GetMapping("/get-messages")
    public List<MessageModel> getAllMessages(){
        return service.getMessages();
    }


}
