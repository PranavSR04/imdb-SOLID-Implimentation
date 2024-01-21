package com.imdb.entity;

import java.util.ArrayList;
import java.util.List;

public class WatchList {
	private List<Movie> movies;

    public WatchList() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

}
