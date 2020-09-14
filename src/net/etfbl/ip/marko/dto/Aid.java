package net.etfbl.ip.marko.dto;

import java.io.Serializable;

public class Aid implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3810972682307113943L;
	
	private int id;
	private String title;
	private String description;
	private String imageUrl;
	private String time;
	private String location;
	private String status;
	private String category;
	
	public Aid() {
		super();
	}
	
	public Aid(String title, String description, String imgUrl, String location, String category) {
		this.title = title;
		this.description = description;
		this.imageUrl = imgUrl;
		this.location = location;
		this.category = category;
	}
	public Aid(int id, String title, String description, String imgUrl, String location, String status,
			String category) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.imageUrl = imgUrl;
		this.location = location;
		this.status = status;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imgUrl) {
		this.imageUrl = imgUrl;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
