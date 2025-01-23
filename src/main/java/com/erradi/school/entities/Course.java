package com.erradi.school.entities;

import java.util.List;

import org.hibernate.annotations.*;

import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import lombok.*;

@Data
@Entity
public class Course {

	@Id
	private String code;
	private String title;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "teacherId")
	private Teacher teacher;
	
	@ManyToMany
	@JoinTable(name = "students_courses", 
				joinColumns = @JoinColumn(name = "course_code"), // Foreign key in join table for this entity
				inverseJoinColumns =  @JoinColumn(name = "student_id"))// Foreign key for the other entity
	private List <Student> students;
}
