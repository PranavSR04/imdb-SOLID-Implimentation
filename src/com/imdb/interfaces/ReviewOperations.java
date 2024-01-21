package com.imdb.interfaces;

import com.imdb.entity.Review;

public interface ReviewOperations {
    void addReview(Review review);
    void deleteReview(Review review);
    void editReview(Review review, String newContent);
}