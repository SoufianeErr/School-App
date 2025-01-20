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
	
	private List<User> users;
	
	private List<Course> courses;
	
}
