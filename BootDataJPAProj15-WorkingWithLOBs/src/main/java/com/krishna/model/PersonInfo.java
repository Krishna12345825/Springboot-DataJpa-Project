package com.krishna.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="Person_Info_lob")
@Data
@AllArgsConstructor
public class PersonInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	@Column(length=20)
	private String pname;
	
	private LocalDateTime dob;
	private boolean married;
	@Lob
	private byte[] photo;
	@Lob
	private char[] resume;
	

}
