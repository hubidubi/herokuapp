package hu.hubidubi.herokuapp.web;

import hu.hubidubi.herokuapp.model.Department;
import hu.hubidubi.herokuapp.model.Employee;
import hu.hubidubi.herokuapp.service.DepartmentService;
import hu.hubidubi.herokuapp.service.EmployeeService;
import hu.hubidubi.herokuapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return testService.hello();
	}

	@RequestMapping("/department")
	@ResponseBody
	public String departments() {
		StringBuilder sb = new StringBuilder();
		for (Department department : departmentService.findAll()) {
			sb.append(department.getName());
			sb.append("<br>");
		}
		return sb.toString();
	}

	@RequestMapping("/employee")
	@ResponseBody
	public String employee() {
		StringBuilder sb=new StringBuilder();
		for (Employee employee:employeeService.findAll()) {
			sb.append(employee.getName());
			sb.append("<br>");
		}
		return sb.toString();
	}
}
