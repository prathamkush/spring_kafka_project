package com.h2db.kafka.consumer.KafkaConsumer.service;


import com.h2db.kafka.consumer.KafkaConsumer.model.MessageModel;
import com.h2db.kafka.consumer.KafkaConsumer.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {


    @Autowired
    MessageRepository repository;


    public MessageModel addMessage(MessageModel message){
        return repository.save(message);
    }


    public List<MessageModel> getMessages(){
        return repository.findAll();
    }


}
