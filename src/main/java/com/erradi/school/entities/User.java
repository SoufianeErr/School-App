package com.erradi.school.entities;

import jakarta.persistence.*;
import lombok.*;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

	@Id
	private Long Id;
	private String name;
	private String email;
	private String password;
	
}
