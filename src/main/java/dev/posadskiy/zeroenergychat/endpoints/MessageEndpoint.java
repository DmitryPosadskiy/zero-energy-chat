package dev.posadskiy.zeroenergychat.endpoints;

import dev.posadskiy.zeroenergychat.controllers.api.MessageController;
import dev.posadskiy.zeroenergychat.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/messages")
public class MessageEndpoint {

    @Autowired
    private MessageController controller;

    @RequestMapping(value = "send", method = RequestMethod.POST)
    public void sendMessage(@RequestBody final Message message) {
        controller.sendMessage(message);
    }

    @RequestMapping(value = "receive", method = RequestMethod.GET)
    public List<Message> receiveMessages() {
        return controller.receiveMessages();
    }
}
