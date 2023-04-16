package com.example.movieapp.movieApplication.Repository;

import com.example.movieapp.movieApplication.model.Media;
import com.example.movieapp.movieApplication.model.Movie;
import com.example.movieapp.movieApplication.model.TVShow;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MediaRepository extends JpaRepository<Media,Long> {
    List<Media> findByMediaType(MediaType mediaType);

    List<Media> findByGenre(String genre);

    List<Media> findByReleaseYear(int releaseYear);

    List<Media> findByTitleContainingIgnoreCase(String title);

    List<Movie> findAllMovies();

    List<TVShow> findAllTVShows();

    List<Media> searchMedia(String query);
}

