package com.pomato.springpomato;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.pomato.dao.MockDatabaseLayer;
import com.pomato.model.Comment;
import com.pomato.model.Rating;
import com.pomato.model.Restaurant;

@RestController
@Component
public class PomatoResource {
	
	/*@Autowired
	private MockDatabaseLayer mockDatabaseLayer;*/
	
	
	// Resources for restaurants
	@GetMapping("/restaurants")
	public List <Restaurant> getAllRestaurants (){
		
		System.out.println("in get all restaurants");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		return mockDatabaseLayer.getResturantList() ;
	}

	@GetMapping("/restaurants/{location}")
	public List <Restaurant> getAllRestaurantsByLocation(@PathVariable String location){
		
		System.out.println("in get all restaurants by location");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		return mockDatabaseLayer.getRestaurantByLocation(location);
	}
	
	@GetMapping("/restaurants/{cuisine}")
	public List <Restaurant> getAllRestaurantsByCuisine(@PathVariable String cuisine){
		
		System.out.println("in get all restaurants by cuisine");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		return mockDatabaseLayer.getRestaurantByCuisine(cuisine);
	}
	
	@PostMapping("/restaurants/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Restaurant addNewRestaurants(@RequestBody Restaurant restaurant){
		
		System.out.println("in add new restaurants");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		System.out.println("new restaurant is "+ mockDatabaseLayer.addRestaurant(restaurant));
		return mockDatabaseLayer.addRestaurant(restaurant);
	}
	
	// Resources for comments
	@GetMapping("/comments/{userid}")
	public List <Comment> getAllCommentsByUser(@PathVariable("userid") String userid){
		
		System.out.println("in get all comments by user");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		return mockDatabaseLayer.getAllCommentsByUser(userid);
	}
	
	@GetMapping("/comments/res/{restaurantId}")
	public List <Comment> getCommentsForRestaurants(@PathVariable("restaurantId") int restaurantId){
		
		System.out.println("in get all comments for a restaurant");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		return mockDatabaseLayer.getCommentsForRestaurants(restaurantId);
	}
	
	@PostMapping("/comments/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Comment addNewComment(@RequestBody Comment comment){
		
		System.out.println("in add new comment");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		System.out.println("new comment added "+ mockDatabaseLayer.addNewComment(comment).toString());
		return mockDatabaseLayer.addNewComment(comment);
	}
	
	// Resources for rating
	@GetMapping("/rating/{restaurantid}")
	public int getRestaurantRating(@PathVariable int restaurantid){
		
		System.out.println("in get restaurant rating");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		return mockDatabaseLayer.getRestaurantRating(restaurantid);
	}
	
	@PostMapping("/rating/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Rating addNewRating(@RequestBody Rating rating){
		
		System.out.println("in add new rating");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		System.out.println("new ratig added "+ mockDatabaseLayer.addNewRating(rating).toString());
		return mockDatabaseLayer.addNewRating(rating);
	}
	
	@PutMapping("/rating/update")
	@ResponseStatus(HttpStatus.OK)
	public Rating updateRating(@RequestBody Rating rating){
		
		System.out.println("in update rating");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		System.out.println("rating updated "+ mockDatabaseLayer.updateRating(rating).toString());
		return mockDatabaseLayer.updateRating(rating);
	}
	
	@DeleteMapping("/rating/remove")
	@ResponseStatus(HttpStatus.OK)
	public Rating removeRating(@RequestBody Rating rating){
		
		System.out.println("in remove rating");
		MockDatabaseLayer mockDatabaseLayer = new MockDatabaseLayer();
		System.out.println("rating removed "+ mockDatabaseLayer.removeRating(rating).toString());
		return mockDatabaseLayer.removeRating(rating);
	}
	
}
