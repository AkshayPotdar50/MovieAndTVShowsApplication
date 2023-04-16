package com.example.movieapp.movieApplication.service;

import com.example.movieapp.movieApplication.Repository.MediaRepository;
import com.example.movieapp.movieApplication.model.*;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public List<Movie> getAllMovies() {
        return mediaRepository.findAllMovies();
    }

    public List<TVShow> getAllTVShows() {
        return mediaRepository.findAllTVShows();
    }

    public List<Media> searchMedia(String query) {
        return mediaRepository.searchMedia(query);
    }

    public Media getMediaById(Long id) throws ChangeSetPersister.NotFoundException {
        return mediaRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
    }

    public List<Review> getMediaReviews(Long id) throws ChangeSetPersister.NotFoundException {
        Media media = getMediaById(id);
        return media.getReviews();
    }

    public Review addReviewToMedia(Long id, Review review) throws ChangeSetPersister.NotFoundException {
        Media media = getMediaById(id);
        media.addReview(review);
        mediaRepository.save(media);
        return review;
    }

    public Rating addRatingToMedia(Long id, Rating rating) throws ChangeSetPersister.NotFoundException {
        Media media = getMediaById(id);
        media.addRating(rating);
        mediaRepository.save(media);
        return rating;
    }

}

