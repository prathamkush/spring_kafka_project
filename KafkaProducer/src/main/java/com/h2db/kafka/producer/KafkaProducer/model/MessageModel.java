package com.h2db.kafka.producer.KafkaProducer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "message_info_producer")
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", from_user='" + from_user + '\'' +
                ", to_user='" + to_user + '\'' +
                ", sent_message='" + sent_message + '\'' +
                '}';
    }
}
