package dev.posadskiy.zeroenergychat.endpoints;

import dev.posadskiy.zeroenergychat.controllers.api.WordController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/words")
public class WordEndpoint {

    @Autowired
    private WordController controller;

    @RequestMapping(value = "count", method = RequestMethod.GET)
    public Map<String, Integer> sendMessage() {
        return controller.getCountWords();
    }

}
