package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class TVShow extends Media{

    private List<Season> seasons;

    public TVShow(long id, String tittle, String description, List<String> genres, Integer
            releaseYear, List<Rating> ratings, List<String> cast, List<String> crew, List<Review> reviews,
                  List<Season> seasons) {
        super(id, tittle, description, genres, releaseYear, ratings, cast, crew, reviews);
        this.seasons = seasons;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "seasons=" + seasons +
                '}';
    }
}
