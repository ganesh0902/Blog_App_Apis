package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.entities.Category;
import com.api.entities.Post;
import com.api.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer> {

	public List<Post> findByCategory(Category category);
	public List<Post> findByUser(User user);	
	
	
	//public List<Post> findByTitleContaining(String title);
	@Query("select p from Post p where p.title like :key")
	 List<Post> searchByTitle(@Param("key") String title);
	
}