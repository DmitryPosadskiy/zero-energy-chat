package dev.posadskiy.zeroenergychat.da.impl;

import dev.posadskiy.zeroenergychat.dto.Message;
import dev.posadskiy.zeroenergychat.da.Storage;

import java.util.ArrayList;
import java.util.List;

public class LocalStorage implements Storage {

    private static List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }
}
