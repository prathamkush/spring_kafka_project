package com.h2db.kafka.consumer.KafkaConsumer.repository;

import com.h2db.kafka.consumer.KafkaConsumer.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel, Integer> {

}
