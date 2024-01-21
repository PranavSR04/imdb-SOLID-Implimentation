package com.imdb.interfaces;

import com.imdb.entity.Movie;
import com.imdb.entity.WatchList;

public interface WatchListOperations {
    void addToWatchlist(WatchList watchList, Movie movie);
    void removeFromWatchlist(WatchList watchList, Movie movie);
}
