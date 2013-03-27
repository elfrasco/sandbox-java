package ar.com.epidataconsulting.sandbox.predicate;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.collections.Predicate;

import ar.com.epidataconsulting.sandbox.model.Employee;

public class OldEmployeePredicate implements Predicate {

	@Override
	public boolean evaluate(Object employeeObj) {
		
		Employee employee = (Employee) employeeObj;
		
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(employee.getDateOfBirth());
		
		return dateOfBirth.get(Calendar.YEAR) <= 1982;
	}

}
