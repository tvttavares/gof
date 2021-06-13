package com.tvt.gof.bridge.abstraction;

import com.tvt.gof.bridge.implementation.MessageSender;

public abstract class Message {

    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}