package hu.hubidubi.herokuapp.service;

import hu.hubidubi.herokuapp.model.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> findAll();
}
