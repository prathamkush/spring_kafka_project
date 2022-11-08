package com.h2db.kafka.producer.KafkaProducer.repository;


import com.h2db.kafka.producer.KafkaProducer.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel, Integer> {

}
