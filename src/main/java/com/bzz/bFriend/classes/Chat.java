package com.bzz.bFriend.classes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descriptiion;

    public Chat() {

    }

    public Chat(String descriptiion) {
        super();
        this.descriptiion = descriptiion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptiion() {
        return descriptiion;
    }

    public void setDescriptiion(String descriptiion) {
        this.descriptiion = descriptiion;
    }

    @Override
    public String toString() {
        return "Chat [id=" + id + ", descriptiion=" + descriptiion + "]";
    }
}
