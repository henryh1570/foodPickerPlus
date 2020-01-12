package fpp;

import java.util.ArrayList;

/**
 * A class example to hold various data about restaurants.
 * To be used and integrated in the main program for food picking.
 */
public class Restaurant {

	private int rating = 0;
	private String name;
	private String website = "N/A";
	private String address;
	private String phoneNumber;
	private ArrayList<String> categories = null;
	
	// Constructor with essential details required.
	public Restaurant(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	// Another constructor with more detailed information.
	public Restaurant(String name, String address, String phoneNumber, String website, int rating) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public int getRating() {
		return rating;
	}
	
	// Rating cannot be higher than 5. Increments of 1 at a time.
	public void increaseRating() {
		if (rating < 5) {
			rating++;
		}
	}
	
	// Rating cannot be lower than 0. Decrements of 1 at a time.
	public void decreaseRating() {
		if (rating > 0) {
			rating--;
		}
	}
	
	public ArrayList<String> getCategories() {
		return categories;
	}
	
}
