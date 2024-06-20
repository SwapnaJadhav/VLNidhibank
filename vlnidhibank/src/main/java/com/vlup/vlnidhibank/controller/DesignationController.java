package com.vlup.vlnidhibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.employeeSection.payloads.Apiresponse;
import com.bank.employeeSection.payloads.DepartmentDto;
import com.bank.employeeSection.payloads.DesignationDto;
import com.bank.employeeSection.services.DepartmentService;
import com.bank.employeeSection.services.DesignationService;

@RestController
@RequestMapping("api/designation")
public class DesignationController {
	
	@Autowired
    private DesignationService designationService;
	
	
	@PostMapping("/")
	public ResponseEntity<DesignationDto> createDesignationt(@RequestBody DesignationDto designationDto)
	{
		DesignationDto designationDtos= this.designationService.createDesignation(designationDto);
		
		return new ResponseEntity<>(designationDtos,HttpStatus.CREATED);
	}
	
	@PutMapping("/{designationDtoId}")
	public ResponseEntity<DesignationDto> updateDesignation(@RequestBody DesignationDto designationDto,@PathVariable Integer designationDtoId)
	{     
		DesignationDto updatedDesignationDto=this.designationService.updateDesignation(designationDto, designationDtoId);
		return ResponseEntity.ok(updatedDesignationDto);
	}
	
	@DeleteMapping("/{designationDtoId}")
	public ResponseEntity<Apiresponse> deleteDesignation(@PathVariable Integer designationDtoId){
		this.designationService.deleteDesignation(designationDtoId);
		return new ResponseEntity<Apiresponse>(new Apiresponse ("Designation deleted Successfully",true), HttpStatus.OK);
	} 
	
	// Get All Branches
	@GetMapping("/")
	public ResponseEntity<List<DesignationDto>> getAllDesignation(){
		
		return ResponseEntity.ok(this.designationService.getAllDesignation());
	}
	
	
	// Get A Single Branch
	@GetMapping("/{designationDtoId}")
	public ResponseEntity<DesignationDto> getDesignationById(@PathVariable Integer designationDtoId){
		
		return ResponseEntity.ok(this.designationService.getDesignationById(designationDtoId));
	}

}
