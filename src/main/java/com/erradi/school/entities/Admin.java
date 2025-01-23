package com.erradi.school.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Admin{

	@Id
	private Long adminId;
	private String role;
	
	@OneToMany(mappedBy = "admin", fetch = FetchType.LAZY)
	private List<User> users;
	
	@OneToMany(mappedBy = "admin", fetch = FetchType.LAZY)
	private List<Course> courses;
	
}
