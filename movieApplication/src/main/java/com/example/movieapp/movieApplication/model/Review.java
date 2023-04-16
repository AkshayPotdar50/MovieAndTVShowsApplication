package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

@Entity
public class Review {
    private String user;
    private String text;

    public Review(String user, String text) {
        this.user = user;
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Review{" +
                "user='" + user + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
