package dev.posadskiy.zeroenergychat.da;

import dev.posadskiy.zeroenergychat.dto.Message;

import java.util.List;

public interface Storage {
    public void addMessage(Message message);
    public List<Message> getMessages();
}
