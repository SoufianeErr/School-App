package com.erradi.school.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Student extends User{

	private int gradeLevel;
	
	private Parent parent;
	private List<Course> courses;
	
}
