package com.imdb.utility;

import com.imdb.entity.Movie;
import com.imdb.entity.Review;
import com.imdb.entity.User;
import com.imdb.entity.WatchList;
import com.imdb.services.ReviewService;
import com.imdb.services.WatchListService;
import com.imdb.interfaces.*;

public class ImdbSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("Inception", "Sci-Fi", "2010");
        User user = new User("JohnDoe");
        WatchList watchList = new WatchList();
        Review review = new Review("Amazing movie!", user, movie);

        WatchListOperations watchListOperation = new WatchListService();
        ReviewOperations reviewOperation = new ReviewService();

        watchListOperation.addToWatchlist(watchList, movie);
        reviewOperation.addReview(review);

	}

}
