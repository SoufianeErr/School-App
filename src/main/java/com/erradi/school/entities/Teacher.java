package com.erradi.school.entities;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Teacher extends User{
	
	private String specialization;
	
	@OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
	private List<Course> courses;

}
