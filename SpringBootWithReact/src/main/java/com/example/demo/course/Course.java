package com.example.demo.course;

public class Course {
	  private Long id;
	  private String username;
	  private String description;
	  //no arg constructor
	  //constructor with 3 args
	  //getters and setters
	  //hashcode and equals
	  public Course() {

	  }

	  public Course(long id, String username, String description) {
	    super();
	    this.id = id;
	    this.username = username;
	    this.description = description;
	  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
