package com.ibm.steam;

public class Series extends Media {
	private int seasons;
	private int episodes;
	
	public Series() {
	}

	public Series(String title, String genre, boolean free, int seasons, int episodes) {
		super(title, genre, free);
		this.seasons = seasons;
		this.episodes = episodes;
	}

	@Override
	public void play(User user) throws SubscriptionException, AgeRestrictionException {
		super.play(user);
		System.out.println("Playing Episode: 1 of Season: 1");
	}
	
	public void play(User user, int season, int episode) throws SubscriptionException, AgeRestrictionException {
		super.play(user);
		if(season <= this.seasons && episode <= this.episodes)
			System.out.println("Playing Episode: " + episode + " of Season: " + season);
		else
			System.out.println("Cannot play requested media");
	}
}
