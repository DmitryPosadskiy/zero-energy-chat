package dev.posadskiy.zeroenergychat;

import dev.posadskiy.zeroenergychat.controllers.MessageControllerImpl;
import dev.posadskiy.zeroenergychat.controllers.WordControllerImpl;
import dev.posadskiy.zeroenergychat.controllers.api.MessageController;
import dev.posadskiy.zeroenergychat.controllers.api.WordController;
import dev.posadskiy.zeroenergychat.da.Storage;
import dev.posadskiy.zeroenergychat.da.impl.LocalStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Storage storage() {
        return new LocalStorage();
    }

    @Bean
    public MessageController messageController() {
        return new MessageControllerImpl();
    }

    @Bean
    public WordController wordController() {
        return new WordControllerImpl();
    }
}

