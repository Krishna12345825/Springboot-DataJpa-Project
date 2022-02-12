package com.krishna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMP_PROFILE")
public class Employee {
	@Id
	@GeneratedValue
	private  Integer eno;
	private String   ename;
	private  String desg;
	private  Float salary;
}
