package com.vastika.userinfo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
		
@Entity
@Table(name="user")
@Data
public class User {
	
	@Id 
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int id; 
	@Column (name="user_name") 
	private String username;
	private String password;
	@Column (name="mobile_no")
	private Long mobile;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Temporal (TemporalType.DATE)
	private Date dob;
	private String email;
	private String gender;
	private String hobbies;
	private String nationality; 
		
}
