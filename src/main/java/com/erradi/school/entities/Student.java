package com.erradi.school.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Student extends User{

	private int gradeLevel;
	
	@ManyToOne
	@JoinColumn(name = "parent_Id")
	private Parent parent;
	
	@ManyToMany(mappedBy = "students")
	private List<Course> courses;
	
}
