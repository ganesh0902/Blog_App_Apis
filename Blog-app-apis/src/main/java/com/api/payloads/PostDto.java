package com.api.payloads;

import java.util.Date;

import com.api.entities.Category;
import com.api.entities.User;

public class PostDto {
	private int postId;
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	
	private CategoryDto category;
	
	private UserDto user;
	
	public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PostDto(String title, String content, String imageName, Date addedDate, CategoryDto category, UserDto user) {
		super();
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedDate = addedDate;
		this.category = category;
		this.user = user;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "PostDto [title=" + title + ", content=" + content + ", image=" + imageName + ", addedDate=" + addedDate
				+ ", category=" + category + ", user=" + user + "]";
	}
}
