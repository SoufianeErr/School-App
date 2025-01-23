package com.erradi.school.entities;

import jakarta.persistence.*;
import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	private Long Id;
	private String name;
	private String email;
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
}
