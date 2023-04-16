package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class Episode extends Media{
    private int episodeNumber;

    public Episode(long id, String tittle, String description, List<String> genres, Integer releaseYear, List<Rating> ratings, List<String> cast, List<String> crew, List<Review> reviews, int episodeNumber) {
        super(id, tittle, description, genres, releaseYear, ratings, cast, crew, reviews);
        this.episodeNumber = episodeNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "episodeNumber=" + episodeNumber +
                '}';
    }
}
