package dev.posadskiy.zeroenergychat.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {
    private String author;
    private String message;
    private LocalDateTime createDate;
}
