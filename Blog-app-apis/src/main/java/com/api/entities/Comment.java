package com.api.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	private String contain;
	
	@ManyToOne
	private Post post;
	
	@ManyToOne
	private User user;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int id, String contain, Post post) {
		super();
		this.id = id;
		this.contain = contain;
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContain() {
		return contain;
	}

	public void setContain(String contain) {
		this.contain = contain;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", contain=" + contain + ", post=" + post + "]";
	}
	
}
