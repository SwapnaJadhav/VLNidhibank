package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.employeeSection.entities.Branch;
import com.bank.employeeSection.entities.Designation;
import com.bank.employeeSection.exceptions.ResourceNotFoundException;
import com.bank.employeeSection.payloads.BranchDto;
import com.bank.employeeSection.payloads.DesignationDto;
import com.bank.employeeSection.repositories.DesignationRepo;
import com.bank.employeeSection.services.DesignationService;


@Service
public class DesignationServiceImpl implements DesignationService{
	
	@Autowired
	private DesignationRepo designationRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	
	private DesignationDto convertEntityToDto(Designation designation) {
		DesignationDto designationDto=this.modelMapper.map(designation, DesignationDto.class);
  	  return  designationDto; 
    }

    
    
    private Designation convertDtoToEntity(DesignationDto designationDto) {
    	Designation designation=this.modelMapper.map(designationDto, Designation.class);
    	  return  designation;
     }
	
	
	 // Get All Designation
	@Override
	public List<DesignationDto> getAllDesignation() {
		List<Designation> designationList=this.designationRepo.findAll();
        List<DesignationDto> listOfDesignationDtos=designationList.stream().map(designationlist->this.convertEntityToDto(designationlist)).collect(Collectors.toList()); 
        return listOfDesignationDtos;
	}

	@Override
	public DesignationDto createDesignation(DesignationDto designationDto) {
		Designation designation = convertDtoToEntity(designationDto);
		Designation savedDesignation= designationRepo.save(designation);
        return this.convertEntityToDto(savedDesignation);
	}

	@Override
	public DesignationDto updateDesignation(DesignationDto designationDto, Integer desig_id) {
		Designation designation=this.designationRepo
    			.findById(desig_id)
    			.orElseThrow(()->new ResourceNotFoundException("Designation","Id",desig_id));
		
		designation.setDesig_id(designationDto.getDesig_id());
		designation.setDesigName(designationDto.getDesigName());
   

		
		Designation updateDesignation= this.designationRepo.save(designation);
		DesignationDto designationDto1=this.convertEntityToDto(updateDesignation);
	    
	    return designationDto1;
	}
	
	
    // Get Single Designation
	@Override
	public DesignationDto getDesignationById(Integer desig_id) {
		Designation designation= this.designationRepo
    			.findById(desig_id)

    			.orElseThrow(()->new ResourceNotFoundException("Designation","Id",desig_id));
    	return this.convertEntityToDto(designation); 
	}
	
	
     // Delete designation from list
	@Override
	public void deleteDesignation(Integer desig_id) {
		Designation desgnation=this.designationRepo
    			.findById(desig_id)

    			.orElseThrow(()->new ResourceNotFoundException("Designation","Id", desig_id));
    	
    	this.designationRepo.delete(desgnation);
	}

}
