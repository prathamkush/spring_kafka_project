package com.h2db.kafka.producer.KafkaProducer.model;

import javax.persistence.Entity;

//@Entity
public class UserModel {
    private String name;
    private String location;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public UserModel(String name, String location, int number) {
        this.name = name;
        this.location = location;
        this.number = number;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", number=" + number +
                '}';
    }
}
