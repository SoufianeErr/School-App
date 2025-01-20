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
	
	private Teacher teacher;
	
	private List <Student> students;
}
