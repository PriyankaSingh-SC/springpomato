package com.pomato.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pomato.model.Comment;
import com.pomato.model.Rating;
import com.pomato.model.Restaurant;

@Component
public class MockDatabaseLayer {
	private List <Restaurant> resturantList;
	private Restaurant restaurant;
	private List <Comment> commentList;
	private Comment comment;
	private Rating rating;
	private int ratingId;
	

	public List<Restaurant> getResturantList() {
		resturantList = new ArrayList <Restaurant> ();
		Restaurant r1 = new Restaurant();
		List <String> cuisineR1 = new ArrayList <String> ();
		cuisineR1.add("North Indian");
		cuisineR1.add("South Indian");
		
		r1.setId(1);
		r1.setName("eat.fit");
		r1.setLocation("Malad");
		r1.setCuisine(cuisineR1);
		resturantList.add(r1);
		
		Restaurant r2 = new Restaurant();
		List <String> cuisineR2 = new ArrayList <String> ();
		cuisineR2.add("Italian");
		cuisineR2.add("Chinese");
		
		r2.setId(2);
		r2.setName("Bistro");
		r2.setLocation("Goregaon");
		r2.setCuisine(cuisineR2);
		resturantList.add(r2);
		return resturantList;
	}
	public List <Restaurant> getRestaurantByCuisine(String cuisine) {
		List <Restaurant> listByCuisine = new ArrayList <Restaurant> ();
		return listByCuisine;
	}
	
	public List <Restaurant> getRestaurantByLocation(String location) {
		List <Restaurant> listByLocation = new ArrayList <Restaurant> ();
		return listByLocation;
	}
	public void setResturantList(List<Restaurant> resturantList) {
		this.resturantList = resturantList;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public Restaurant addRestaurant(Restaurant restaurant) {
		
		Restaurant r = new Restaurant();
		r.setId(restaurant.getId());
		r.setName(restaurant.getName());
		r.setLocation(restaurant.getLocation());
		r.setCuisine(restaurant.getCuisine());
		
		getResturantList().add(r);
		return r;
	}
	public List<Comment> getAllCommentsByUser(String userid) {
	
		List<Comment>commentListByUser = new ArrayList<Comment>();
		Comment comment = new Comment();
		List<Comment> commentList = comment.getAllComments();
		for (Comment commentByUser : commentList) {
			if(commentByUser.getUser().equalsIgnoreCase(userid)) {
				commentListByUser.add(commentByUser);
			}
		}
		return commentListByUser;
	}
	public List<Comment> getCommentsForRestaurants(int restaurantId) {
		List<Comment>commentListByRestaurant = new ArrayList<Comment>();
		Comment comment = new Comment();
		List<Comment> commentList = comment.getAllComments();
		for (Comment commentByResId : commentList) {
			if(commentByResId.getRestaurantId() - restaurantId <= 0 ) {
				commentListByRestaurant.add(commentByResId);
			}
		}
		return commentListByRestaurant;
	}
	public Comment addNewComment(Comment comment) {
		
		Comment c = new Comment();
		c.setUser(comment.getUser());
		c.setRestaurantId(comment.getRestaurantId());
		c.setCommentText(comment.getCommentText());
		return c;
	}
	public int getRestaurantRating(int restaurantid) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Rating addNewRating(Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}
	public Rating updateRating(Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}
	public Rating removeRating(Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
