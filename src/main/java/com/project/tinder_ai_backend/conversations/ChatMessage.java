package com.project.tinder_ai_backend.conversations;

import java.time.LocalDateTime;

public record ChatMessage(
        String messsageText,
        String authorId,
        LocalDateTime messageTime

) {
}
