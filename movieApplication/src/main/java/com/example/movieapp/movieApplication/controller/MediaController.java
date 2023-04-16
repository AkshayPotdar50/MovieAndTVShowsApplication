package com.example.movieapp.movieApplication.controller;

import com.example.movieapp.movieApplication.model.*;
import com.example.movieapp.movieApplication.service.MediaService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {

    private final MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return mediaService.getAllMovies();
    }

    @GetMapping("/tvshows")
    public List<TVShow> getAllTVShows() {
        return mediaService.getAllTVShows();
    }

    @GetMapping("/search")
    public List<Media> searchMedia(@RequestParam String query) {
        return mediaService.searchMedia(query);
    }

    @GetMapping("/{id}")
    public Media getMediaById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return mediaService.getMediaById(id);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> getMediaReviews(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return mediaService.getMediaReviews(id);
    }

    @PostMapping("/{id}/reviews")
    public Review addReviewToMedia(@PathVariable Long id, @RequestBody Review review) throws ChangeSetPersister.NotFoundException {
        return mediaService.addReviewToMedia(id, review);
    }

    @PostMapping("/{id}/ratings")
    public Rating addRatingToMedia(@PathVariable Long id, @RequestBody Rating rating) throws ChangeSetPersister.NotFoundException {
        return mediaService.addRatingToMedia(id, rating);
    }
}

