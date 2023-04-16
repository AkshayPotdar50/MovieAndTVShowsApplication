package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class Season {
    private int SeasonNumber;
    private List<Episode> episodes;

    public Season(int seasonNumber, List<Episode> episodes) {
        SeasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    public int getSeasonNumber() {
        return SeasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        SeasonNumber = seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SeasonNumber=" + SeasonNumber +
                ", episodes=" + episodes +
                '}';
    }

}
