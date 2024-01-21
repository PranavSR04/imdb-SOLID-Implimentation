package com.imdb.services;

import com.imdb.entity.Movie;
import com.imdb.entity.WatchList;
import com.imdb.interfaces.WatchListOperations;

public class WatchListService implements WatchListOperations{

	@Override
	public void addToWatchlist(WatchList watchList, Movie movie) {
		watchList.addMovie(movie);
		
	}

	@Override
	public void removeFromWatchlist(WatchList watchList, Movie movie) {
		watchList.removeMovie(movie);
		
	}
	

}
