package com.api.service;

import java.util.List;

import com.api.entities.Post;
import com.api.payloads.PostDto;

public interface PostService {
	
	//create
	PostDto createPost(PostDto post,int userId,int categoryId);
	
	//update 
	PostDto updatePost(PostDto post,int postId);
	
	//delete post	
	void deletePost(int id);
	
	//get single post
	public PostDto getPostById(int id);
	
	//get all post
	public List<PostDto> getAllPost();
	
	//get post by category	
	public List<PostDto> getPostByCategory(int categoryId);
	
	//get Post by user
	public List<PostDto> getPostByUser(int userId);
	
	//list search
	public List<PostDto> searchByPosts(String keyword);
}