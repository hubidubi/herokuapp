package hu.hubidubi.herokuapp.service;

import hu.hubidubi.herokuapp.model.Department;
import hu.hubidubi.herokuapp.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	private static Logger logger= LoggerFactory.getLogger("DepartmetnServiceImpl.class");

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {
		logger.info("DepartmentService.findAll");
		return departmentRepository.findAll();
	}

}
