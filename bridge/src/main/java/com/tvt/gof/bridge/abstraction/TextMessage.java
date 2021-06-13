package com.tvt.gof.bridge.abstraction;

import com.tvt.gof.bridge.implementation.MessageSender;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}