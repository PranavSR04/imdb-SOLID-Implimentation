package com.imdb.services;

import com.imdb.entity.Review;
import com.imdb.interfaces.ReviewOperations;

public class ReviewService implements ReviewOperations{

	@Override
	public void addReview(Review review) {
		
		System.out.println("Review Added");
		
	}

	@Override
	public void deleteReview(Review review) {
		// TODO Auto-generated method stub
		System.out.println("Review Deleted");
		
	}

	@Override
	public void editReview(Review review, String newContent) {
		// TODO Auto-generated method stub
		System.out.println("Review Edited");
		
	}
	


}
