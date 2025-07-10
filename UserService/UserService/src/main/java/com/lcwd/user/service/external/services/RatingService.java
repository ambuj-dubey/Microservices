package com.lcwd.user.service.external.services;

import com.lcwd.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Map;
import java.util.Objects;

@FeignClient(name ="RATING-SERVICE")
public interface RatingService {
    //GET

    //POST
    @PostMapping("/ratings")
    public ResponseEntity<Rating> createRating(Rating values);

    //PUT
    @PutMapping("/rating/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable Rating rating, String ratingId);

    //Delete
    @DeleteMapping("/rating/{ratingId}")
    public void deleteRating(@PathVariable String ratingId);
}
