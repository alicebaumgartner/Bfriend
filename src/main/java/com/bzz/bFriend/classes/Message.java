package com.bzz.bFriend.classes;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private LocalDateTime time;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "from_id", foreignKey = @ForeignKey(name = "User_ID_FK"))
    private User from;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "chat_id", foreignKey = @ForeignKey(name = "Chat_ID_FK"))
    private Chat chat;

    public Message() {

    }

    public Message(String message, LocalDateTime time, User from, Chat chat) {
        super();
        this.message = message;
        this.time = time;
        this.from = from;
        this.chat = chat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", message=" + message + ", time=" + time + ", from="
                + from + ", chat=" + "]";
    }
}
