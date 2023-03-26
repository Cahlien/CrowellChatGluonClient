package dev.crowell.crowellchat.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class ChatMessageModel {
    private Long id;
    private Long conversationId;
    private String message;
    private LocalDateTime timestamp;
    private ChatterIdentityModel sender;

    public ChatMessageModel() {
        this(null, null, null, null, null);
    }

    public ChatMessageModel(Long id, Long conversationId, String message, LocalDateTime timestamp, ChatterIdentityModel sender) {
        this.id = id;
        this.conversationId = conversationId;
        this.message = message;
        this.timestamp = timestamp;
        this.sender = sender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public ChatterIdentityModel getSender() {
        return sender;
    }

    public void setSender(ChatterIdentityModel sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatMessageModel that = (ChatMessageModel) o;
        return Objects.equals(id, that.id) && Objects.equals(conversationId, that.conversationId) && Objects.equals(message, that.message) && Objects.equals(timestamp, that.timestamp) && Objects.equals(sender, that.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, conversationId, message, timestamp, sender);
    }

    @Override
    public String toString() {
        return "ChatMessageModel{" +
                "id=" + id +
                ", conversationId=" + conversationId +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", sender=" + sender +
                '}';
    }
}
