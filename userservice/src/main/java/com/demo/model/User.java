package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class User.
 */
@Entity
@Table(name = "user")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new user.
 */
@NoArgsConstructor

/**
 * Instantiates a new user.
 *
 * @param id the id
 * @param name the name
 * @param age the age
 * @param email the email
 */
@AllArgsConstructor
public class User {

	/** The id. */
	@Id
	private long id;
	
	/** The name. */
	private String name;
	
	/** The age. */
	private int age;
	
	/** The email. */
	private String email;

}
