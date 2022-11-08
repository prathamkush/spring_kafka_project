package com.h2db.kafka.consumer.KafkaConsumer.consumer;


import com.h2db.kafka.consumer.KafkaConsumer.model.MessageModel;
import com.h2db.kafka.consumer.KafkaConsumer.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicConsumer {

    @Value("${topic.name.consumer}")
    private String topicName;

    @Autowired
    private MessageService service;

    private String latest_consume;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id_consumer")
    public String consume(ConsumerRecord<String, String> payload){
        System.out.println(payload);
        log.info("Topic Name:"+ topicName);
        log.info("Key:"+ payload.key());
        log.info("Value:"+ payload.value());
        log.info("Headers:"+ payload.headers());
        log.info("Partitions:"+ payload.partition());

        latest_consume = payload.value();



        return payload.value();
    }

    public String getLatest_consume() {
        return latest_consume;
    }
}
