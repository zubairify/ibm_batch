package com.ibm.steam;

public class Movie extends Media {
	public Movie() {
	}

	public Movie(String title, String genre, boolean free) {
		super(title, genre, free);
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		super.play(user);
		System.out.println("Playing movie.." + title);
	}
}
