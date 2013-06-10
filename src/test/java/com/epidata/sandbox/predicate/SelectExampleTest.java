package com.epidata.sandbox.predicate;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.epidata.sandbox.model.Employee;
import com.epidata.sandbox.model.mock.ProjectMockBuilder;
import com.epidata.sandbox.predicate.SelectExample;


public class SelectExampleTest {
	
	private static final Logger logger = Logger.getLogger(SelectExampleTest.class);

	@Test
	public void findOldEmployeesOfTeam() {
		
		SelectExample selectExample = new SelectExample();
		
		List<Employee> oldEmployees = selectExample.findOldEmployeesOfTeam(
				ProjectMockBuilder.createPredictiveEngine());
		
		Assert.assertFalse(oldEmployees.isEmpty());
		for (Employee employee : oldEmployees) {
			
			Calendar dateOfBirth = new GregorianCalendar();
			dateOfBirth.setTime(employee.getDateOfBirth());
					
			Assert.assertTrue(dateOfBirth.get(Calendar.YEAR) <= 1982);
			
			logger.debug("Employee: " + employee.getName());
		}
	}
}
