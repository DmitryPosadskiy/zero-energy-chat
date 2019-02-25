package dev.posadskiy.zeroenergychat.controllers;

import dev.posadskiy.zeroenergychat.controllers.api.MessageController;
import dev.posadskiy.zeroenergychat.da.Storage;
import dev.posadskiy.zeroenergychat.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class MessageControllerImpl implements MessageController {

    @Autowired
    private Storage storage;

    @Override
    public void sendMessage(Message message) {
        message.setCreateDate(LocalDateTime.now());
        storage.addMessage(message);
    }

    @Override
    public List<Message> receiveMessages() {
        return storage.getMessages();
    }
}
