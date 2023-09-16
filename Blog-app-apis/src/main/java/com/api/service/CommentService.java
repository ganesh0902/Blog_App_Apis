package com.api.service;

import com.api.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto,int postId,int userId);
	void deleteComment(int id);
}
