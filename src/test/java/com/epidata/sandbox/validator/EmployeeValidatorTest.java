package com.epidata.sandbox.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.epidata.sandbox.model.Employee;
import com.epidata.sandbox.model.ValidationErrorMessages;

public class EmployeeValidatorTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void nameIsNull() {

		Employee employee = new Employee();
		employee.setFileNumber("15488");
		
		Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(employee);
		Assert.assertEquals(1, constraintViolations.size());
		Assert.assertEquals(ValidationErrorMessages.NAME_NOT_NULL,
				constraintViolations.iterator().next().getMessage());
	}
	
	@Test
	public void fileNumberIsTooShort() {

		Employee employee = new Employee();
		employee.setName("Peter");
		employee.setFileNumber("1");

		Set<ConstraintViolation<Employee>> constraintViolations = validator
				.validate(employee);
		Assert.assertEquals(1, constraintViolations.size());
		Assert.assertEquals(ValidationErrorMessages.FILE_NUMBER_SIZE,
				constraintViolations.iterator().next().getMessage());
	}
	
}
