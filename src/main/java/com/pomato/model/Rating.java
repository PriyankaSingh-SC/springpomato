package com.pomato.model;

public class Rating {

	private int restaurantId;
	private String user;
	private int rating;
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Rating [restaurantId=" + restaurantId + ", user=" + user + ", rating=" + rating + "]";
	}
	
}
