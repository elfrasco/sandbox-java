package com.epidata.sandbox.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.log4j.Logger;


public class Employee {

	private static final Logger logger = Logger.getLogger(Employee.class);

	private String id;
	
	@NotNull(message = ValidationErrorMessages.NAME_NOT_NULL)
	private String name;
	
	private String secondName;
	
	private String lastName;
	
	private Date dateOfBirth;
	
	@Size(min = 2, max = 14, message = ValidationErrorMessages.FILE_NUMBER_SIZE)
	private String fileNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	
	public void work() {
		logger.debug("Employee working!!!");
	}
	
	public boolean hasAProject() {
		return true;
	}

}
