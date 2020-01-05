package com.pomato.model;

import java.util.List;

public class Restaurant {
	private int id;
	private String name;
	private List <Comment> commentList;
	private Rating rating;
	private String location;
	private List <String> cuisine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getCuisine() {
		return cuisine;
	}
	public void setCuisine(List<String> cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", commentList=" + commentList + ", rating=" + rating
				+ ", location=" + location + ", cuisine=" + cuisine + "]";
	}

	
}
