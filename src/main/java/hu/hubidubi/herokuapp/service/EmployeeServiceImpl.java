package hu.hubidubi.herokuapp.service;

import hu.hubidubi.herokuapp.model.Employee;
import hu.hubidubi.herokuapp.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static Logger logger = LoggerFactory.getLogger("EmployeeServiceImpl.class");

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		logger.info("Employee.findAll()");
		return employeeRepository.findAll();
	}
}
