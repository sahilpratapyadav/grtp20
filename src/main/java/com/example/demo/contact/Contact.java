package com.example.demo.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Contact {
	@Id
	@GeneratedValue
	private Long id;
	private String  name;
	private String email;
	private Long phno;

}
