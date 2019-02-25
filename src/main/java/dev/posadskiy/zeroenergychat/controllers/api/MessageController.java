package dev.posadskiy.zeroenergychat.controllers.api;

import dev.posadskiy.zeroenergychat.dto.Message;

import java.util.List;

public interface MessageController {
    public void sendMessage(Message message);
    public List<Message> receiveMessages();
}
