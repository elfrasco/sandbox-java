package com.epidata.sandbox.predicate;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.epidata.sandbox.model.Employee;
import com.epidata.sandbox.model.Project;


public class SelectExample {

	@SuppressWarnings("unchecked")
	public List<Employee> findOldEmployeesOfTeam(Project project) {
		List<Employee> team = project.getTeam();
		return (List<Employee>) CollectionUtils.select(team, new OldEmployeePredicate());
	}

}
