package com.h2db.kafka.consumer.KafkaConsumer.controller;


import com.h2db.kafka.consumer.KafkaConsumer.consumer.TopicConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka/consumer")
public class ConsumerController {

    private final TopicConsumer topicConsumer;


    @GetMapping("/consume")
    public String consume(){
        return topicConsumer.getLatest_consume();
    }


}
