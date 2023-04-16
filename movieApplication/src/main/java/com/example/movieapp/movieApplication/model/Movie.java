package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class Movie extends Media{
    private int DurationInMinutes;

    public Movie(long id, String tittle, String description, List<String> genres, Integer releaseYear, List<Rating> ratings, List<String> cast, List<String> crew, List<Review> reviews, int durationInMinutes) {
        super(id, tittle, description, genres, releaseYear, ratings, cast, crew, reviews);
        DurationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return DurationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        DurationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "DurationInMinutes=" + DurationInMinutes +
                '}';
    }
}
