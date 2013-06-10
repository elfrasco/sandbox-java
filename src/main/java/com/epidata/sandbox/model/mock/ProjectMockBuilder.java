package com.epidata.sandbox.model.mock;

import java.util.ArrayList;
import java.util.List;

import com.epidata.sandbox.model.Employee;
import com.epidata.sandbox.model.Project;
import com.epidata.sandbox.model.ProjectType;


public class ProjectMockBuilder {

	public static Project createPredictiveEngine() {
		Project project = new Project();
		project.setName("Predictive Engine");
		project.setClientName("OSDE");
		project.setDurationInMonths(4);
		project.setType(ProjectType.DEVELOPMENT);
		project.setTeam(createTeam());
		return project;
	}
	
	private static List<Employee> createTeam() {

		Employee florencia = EmployeeMockBuilder.createFlorenciaCastagnino();		
		Employee adrian = EmployeeMockBuilder.createAdrianParedes();		
		Employee leonardo = EmployeeMockBuilder.createLeonardoPavanello();		
		Employee juan = EmployeeMockBuilder.createJuanGaragorri();		
		Employee veronica = EmployeeMockBuilder.createVeronicaPechersky();
		Employee erica = EmployeeMockBuilder.createEricaQuispe();
		
		List<Employee> team = new ArrayList<Employee>();
		team.add(florencia);
		team.add(veronica);
		team.add(adrian);
		team.add(leonardo);
		team.add(juan);
		team.add(erica);
		return team;
	}

}
