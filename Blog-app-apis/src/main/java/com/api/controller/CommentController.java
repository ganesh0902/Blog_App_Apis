package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Comment;
import com.api.payloads.CommentDto;
import com.api.service.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

	@Autowired
	private CommentService service;
	
	@PostMapping("/post/{postId}/{userId}/comment")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment,@PathVariable("postId") int postId,@PathVariable("userId")int userId)
	{
		
		
		CommentDto createComment = this.service.createComment(comment, postId,userId);
				
		return new ResponseEntity<CommentDto>(createComment,HttpStatus.OK);
	}
}
