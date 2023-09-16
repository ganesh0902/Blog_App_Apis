package com.api.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Comment;
import com.api.entities.Post;
import com.api.entities.User;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.CommentDto;
import com.api.repository.CommentRepo;
import com.api.repository.PostRepo;
import com.api.repository.UserRepo;
import com.api.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, int postId,int userId) {
		// TODO Auto-generated method stub
		
		CommentDto map2 = null;
		try {
			Post post=this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post"," Id ", postId));
			User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User ","Id", userId));
			
			Comment map = this.mapper.map(commentDto,Comment.class);
			
			map.setPost(post);
			map.setUser(user);
			Comment save = this.commentRepo.save(map);
			
			 map2 = this.mapper.map(save,CommentDto.class);
			
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map2;
	}

	@Override
	public void deleteComment(int id) {
		// TODO Auto-generated method stub
		
	}
}