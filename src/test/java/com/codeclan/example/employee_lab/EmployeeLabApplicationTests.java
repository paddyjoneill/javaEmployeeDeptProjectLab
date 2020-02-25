package com.codeclan.example.employee_lab;

import com.codeclan.example.employee_lab.models.Department;
import com.codeclan.example.employee_lab.models.Employee;
import com.codeclan.example.employee_lab.models.Project;
import com.codeclan.example.employee_lab.repositories.DepartmentRepository;
import com.codeclan.example.employee_lab.repositories.EmployeeRepository;
import com.codeclan.example.employee_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeAndDepartment(){
		Department department = new Department("Sales");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Smith","01234", department);
		employeeRepository.save(employee);

	}

	@Test
	void addEmployeesAndProjects(){
		Department department = new Department("Sales");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Smith","01234", department);
		employeeRepository.save(employee);

		Project project = new Project("Sales Project", 12);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);

	}

}
