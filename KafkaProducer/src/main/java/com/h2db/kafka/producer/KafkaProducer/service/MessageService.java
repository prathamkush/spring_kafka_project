package com.h2db.kafka.producer.KafkaProducer.service;


import com.h2db.kafka.producer.KafkaProducer.model.MessageModel;
import com.h2db.kafka.producer.KafkaProducer.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public MessageModel addMessage(MessageModel message){
        return repository.save(message);
    }

    public List<MessageModel> getMessages(){
        return repository.findAll();
    }

}
