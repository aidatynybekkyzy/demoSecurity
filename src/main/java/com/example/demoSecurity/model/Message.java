package com.example.demoSecurity.model;

public class Message {
    int id ;
    String message;

    public Message() {
    }

    public Message(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessae() {
        return message;
    }

    public void setMessae(String message) {
        this.message = message;
    }
}
