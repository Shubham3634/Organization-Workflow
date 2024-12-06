package com.tka.OrganizationWrokflow.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String status;
	private String department;
	private String mobileno;
	private String emailid;

	private String createdBy;
	@JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss")
	private Date createdDate;
	
	private String updatedBy;
	@JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss")
	private Date updatedDate;
	private double salary;

	@ManyToOne
	@JoinColumn(name = "cid")
	private Country country;

}
