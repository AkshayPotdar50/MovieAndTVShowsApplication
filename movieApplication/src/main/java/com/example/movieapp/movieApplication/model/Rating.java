package com.example.movieapp.movieApplication.model;

import jakarta.persistence.Entity;

@Entity
public class Rating {
    private String source;
    private double value;

    public Rating(String source, double value) {
        this.source = source;
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "source='" + source + '\'' +
                ", value=" + value +
                '}';
    }
}
