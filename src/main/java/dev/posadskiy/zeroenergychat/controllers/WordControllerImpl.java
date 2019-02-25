package dev.posadskiy.zeroenergychat.controllers;

import dev.posadskiy.zeroenergychat.controllers.api.WordController;
import dev.posadskiy.zeroenergychat.da.Storage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordControllerImpl implements WordController {
    @Autowired
    private Storage storage;

    @Override
    public Map<String, Integer> getCountWords() {
        Map<String, Integer> wordCount = new HashMap<>();
        storage.getMessages().forEach(message -> {
            if (message.getMessage() == null) return;
            Arrays.stream(message.getMessage().split(" ")).forEach(s -> {
                if (wordCount.containsKey(s)) {
                    wordCount.put(s, wordCount.get(s) + 1);
                } else {
                    wordCount.put(s, 1);
                }
            });
        });
        return wordCount;
    }
}
