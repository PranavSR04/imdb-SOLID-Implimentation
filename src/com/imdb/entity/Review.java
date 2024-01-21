package com.imdb.entity;

public class Review {
	private String content;
	private User user;
    private Movie movie;
    public String getContent() {
		return content;
	}
    
    
    public Review(String content, User user, Movie movie) {
        this.content = content;
        this.user = user;
        this.movie = movie;
    }

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	

    


}
