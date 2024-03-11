package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
    
	@Autowired
	private DepartmentRepository departmentrepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentrepository.save(department);
	}


	public Department findDepartmentById(Long depId) {
		// TODO Auto-generated method stub
		log.info("Inside findDepartmentById of DepartmentService ");
		return departmentrepository.findByDepartmentId(depId);
	}

}
