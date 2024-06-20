package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.employeeSection.entities.Bank;
import com.bank.employeeSection.entities.Branch;
import com.bank.employeeSection.entities.Department;
import com.bank.employeeSection.exceptions.ResourceNotFoundException;
import com.bank.employeeSection.payloads.BankDto;
import com.bank.employeeSection.payloads.BranchDto;
import com.bank.employeeSection.payloads.DepartmentDto;
import com.bank.employeeSection.repositories.DepartmentRepo;
import com.bank.employeeSection.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo departmrntRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private DepartmentDto convertEntityToDto(Department department) {
		DepartmentDto departmentDto=this.modelMapper.map(department, DepartmentDto.class);
  	  return departmentDto; 
    }

    
    
    private Department convertDtoToEntity(DepartmentDto departmentDto) {
    	Department department=this.modelMapper.map(departmentDto, Department.class);
    	  return department;
     }

	

	@Override
	public List<DepartmentDto> getAllDepartments() {
		List<Department> departmentList=this.departmrntRepo.findAll();
        List<DepartmentDto> listOfDepartmentDtos=departmentList.stream().map(departmentlist->this.convertEntityToDto(departmentlist)).collect(Collectors.toList()); 
        return listOfDepartmentDtos;
	}

	@Override
	public DepartmentDto createDepertment(DepartmentDto departmentDto) {
		Department department = convertDtoToEntity(departmentDto);
        Department savedDepartment= departmrntRepo.save(department);
        return this.convertEntityToDto(savedDepartment);
	}

	@Override
	public DepartmentDto updateDeaprtment(DepartmentDto departmentDto, Integer depart_id) {
		Department department=this.departmrntRepo
    			.findById(depart_id)
    			.orElseThrow(()->new ResourceNotFoundException("Department","Id",depart_id));
		
		department.setDepart_id(departmentDto.getDepart_id());
		department.setDepartName(departmentDto.getDepartName());
		department.setDescription(departmentDto.getDescription());
   
        Department updateDepartment= this.departmrntRepo.save(department);
	    DepartmentDto departmentDto1=this.convertEntityToDto(updateDepartment);
	    
	    return departmentDto1;
	}

	@Override
	public DepartmentDto getDepartmentById(Integer depart_id) {
		Department department = this.departmrntRepo
    			.findById(depart_id)

    			.orElseThrow(()->new ResourceNotFoundException("Department","Id",depart_id));
    	return this.convertEntityToDto(department); 
	}

	@Override
	public void deleteDepertment(Integer depart_id) {
		Department department=this.departmrntRepo
    			.findById(depart_id)

    			.orElseThrow(()->new ResourceNotFoundException("Department","Id",depart_id));
    	
    	this.departmrntRepo.delete(department);
		
	}

}
