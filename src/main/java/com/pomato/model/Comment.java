package com.pomato.model;

import java.util.ArrayList;
import java.util.List;

public class Comment {

	private int restaurantId;
	private String user;
	private String commentText;
		
	public List<Comment> getAllComments(){
		List <Comment> commentList = new ArrayList<Comment>();
		
		Comment c1 = new Comment();
		c1.setUser("Priyanka");
		c1.setRestaurantId(1);
		c1.setCommentText("Good restaurant for heatly eating");
		commentList.add(c1);
		
		Comment c2 = new Comment();
		c2.setUser("Nayana");
		c2.setRestaurantId(2);
		c2.setCommentText("Good restaurant for North Indian food");
		commentList.add(c2);
		
		Comment c3 = new Comment();
		c3.setUser("Priyanka");
		c3.setRestaurantId(1);
		c3.setCommentText("Good for Punjabi food");
		commentList.add(c3);
		
		Comment c4 = new Comment();
		c4.setUser("Dhruba");
		c4.setRestaurantId(1);
		c4.setCommentText("Good salad and protein options");
		commentList.add(c4);
				
		return commentList;
			
	}
	
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
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	@Override
	public String toString() {
		return "Comment [restaurantId=" + restaurantId + ", user=" + user + ", commentText=" + commentText + "]";
	}
	
}
