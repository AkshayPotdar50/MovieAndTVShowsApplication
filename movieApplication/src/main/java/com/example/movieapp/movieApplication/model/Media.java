package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class Media {
    private long id;
    private String tittle;
    private String description;
    private List<String> genres;
    private Integer releaseYear;
    private List<Rating> ratings;
    private List<String> cast;
    private List<String> crew;
    private List<Review> reviews;

    public Media(long id, String tittle, String description, List<String> genres,
                 Integer releaseYear, List<Rating> ratings, List<String> cast, List<String> crew,
                 List<Review> reviews) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.genres = genres;
        this.releaseYear = releaseYear;
        this.ratings = ratings;
        this.cast = cast;
        this.crew = crew;
        this.reviews = reviews;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public List<String> getCrew() {
        return crew;
    }

    public void setCrew(List<String> crew) {
        this.crew = crew;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", genres=" + genres +
                ", releaseYear=" + releaseYear +
                ", ratings=" + ratings +
                ", cast=" + cast +
                ", crew=" + crew +
                ", reviews=" + reviews +
                '}';
    }

    public void addReview(Review review) {
    }

    public void addRating(Rating rating) {
    }
}
