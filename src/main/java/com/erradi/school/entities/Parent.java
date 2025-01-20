package com.erradi.school.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Parent extends User{

	private List<Student> students;
}
