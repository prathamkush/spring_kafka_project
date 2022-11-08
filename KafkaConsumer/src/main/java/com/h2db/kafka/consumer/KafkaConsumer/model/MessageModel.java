package com.h2db.kafka.consumer.KafkaConsumer.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "messages_info_consumer")
public class MessageModel {

    @Id
    @GeneratedValue
    private int id;
    private String from_user;
    private String to_user;
    private String sent_message;

    public MessageModel(String from_user, String to_user, String sent_message) {
        this.from_user = from_user;
        this.to_user = to_user;
        this.sent_message = sent_message;
    }
}
