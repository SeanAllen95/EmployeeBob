package com.codeclan.example.Employees;

import com.codeclan.example.Employees.models.Assignment;
import com.codeclan.example.Employees.models.Department;
import com.codeclan.example.Employees.models.Employee;
import com.codeclan.example.Employees.models.Project;
import com.codeclan.example.Employees.repositories.AssignmentRepository;
import com.codeclan.example.Employees.repositories.DepartmentRepository;
import com.codeclan.example.Employees.repositories.EmployeeRepository;
import com.codeclan.example.Employees.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndProject(){

		Department department = new Department("Accounting");
		departmentRepository.save(department);
		Employee employee = new Employee("Bob", "Greyfriars", "A17", department);
		employeeRepository.save(employee);
		Project project = new Project("Revenue analysis", 10);
		projectRepository.save(project);
		Assignment assignment = new Assignment(employee, project);
		assignmentRepository.save(assignment);

	}

}
