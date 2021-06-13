package com.tvt.gof.bridge.abstraction;

import com.tvt.gof.bridge.implementation.EmailMessageSender;
import com.tvt.gof.bridge.implementation.MessageSender;
import com.tvt.gof.bridge.implementation.TextMessageSender;
import org.junit.jupiter.api.Test;

public class MessageTest {

    @Test
    public void testSend() throws Exception {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new TextMessage(emailMessageSender);
        emailMessage.send();
    }
}