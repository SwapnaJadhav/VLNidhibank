package com.vlup.vlnidhibank.service;

import java.util.List;


import com.bank.employeeSection.payloads.DepartmentDto;

public interface DepartmentService {
	 List<DepartmentDto> getAllDepartments(); 
	 DepartmentDto createDepertment(DepartmentDto departmentDto);
	 DepartmentDto updateDeaprtment(DepartmentDto departmentDto, Integer depart_id);
	 DepartmentDto getDepartmentById(Integer depart_id);
	
	void deleteDepertment(Integer depart_id);

}
