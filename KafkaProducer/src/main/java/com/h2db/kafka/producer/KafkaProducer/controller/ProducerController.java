package com.h2db.kafka.producer.KafkaProducer.controller;


import com.h2db.kafka.producer.KafkaProducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka/producer")
public class ProducerController {

    private final TopicProducer topicProducer;

    @GetMapping("/send/{name}")
    public void send(@PathVariable("name") String name){
        topicProducer.send("Hello "+name);
    }

    @PostMapping("/send-with-body")
    public void sendWithBody(@RequestBody Map<String, Object> body){
        topicProducer.sendWithBody(body);
    }



}
