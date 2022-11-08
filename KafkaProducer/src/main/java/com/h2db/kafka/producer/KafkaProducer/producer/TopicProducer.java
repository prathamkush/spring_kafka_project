package com.h2db.kafka.producer.KafkaProducer.producer;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j // setter/getter/constructor/table
@RequiredArgsConstructor
@Service
public class TopicProducer {

    @Value("${topic.name.producer}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

//    private final KafkaTemplate<String, Map<String, Object>> kafkaTemplate2;

    public void send(String message){
        kafkaTemplate.send(topicName, message);
    }


    public void sendWithBody(Map<String, Object> body){
        kafkaTemplate.send(topicName, body.toString());
//        kafkaTemplate2.send(topicName, body);
    }

}
