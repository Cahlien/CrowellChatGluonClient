package dev.crowell.crowellchat.models;

import java.util.LinkedList;
import java.util.Objects;

public class ConversationModel {
    private Long id;
    private LinkedList<ChatterIdentityModel> participants;
    private LinkedList<ChatMessageModel> messages;

    public ConversationModel() {
        this(null, null, null);
    }

    public ConversationModel(Long id, LinkedList<ChatterIdentityModel> participants, LinkedList<ChatMessageModel> messages) {
        this.id = id;
        this.participants = participants;
        this.messages = messages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LinkedList<ChatterIdentityModel> getParticipants() {
        return participants;
    }

    public void setParticipants(LinkedList<ChatterIdentityModel> participants) {
        this.participants = participants;
    }

    public LinkedList<ChatMessageModel> getMessages() {
        return messages;
    }

    public void setMessages(LinkedList<ChatMessageModel> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversationModel that = (ConversationModel) o;
        return Objects.equals(id, that.id) && Objects.equals(participants, that.participants) && Objects.equals(messages, that.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, participants, messages);
    }

    @Override
    public String toString() {
        return "ConversationModel{" +
                "id=" + id +
                ", participants=" + participants +
                ", messages=" + messages +
                '}';
    }
}
