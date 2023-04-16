package com.example.movieapp.movieApplication.Repository;

import com.example.movieapp.movieApplication.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
@Repository
public interface RatingRepository extends JpaRepository<Rating,Long> {
    List<Rating> findByMediaId(Long mediaId);

    OptionalDouble findAverageRatingByMediaId(Long mediaId);

    Optional<Rating> findByUserIdAndMediaId(String userId, Long mediaId);
}
