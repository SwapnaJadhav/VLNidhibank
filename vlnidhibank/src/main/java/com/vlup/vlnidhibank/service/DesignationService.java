package com.vlup.vlnidhibank.service;

import java.util.List;

import com.bank.employeeSection.payloads.DesignationDto;


public interface DesignationService {
	 List<DesignationDto> getAllDesignation(); 
	 DesignationDto createDesignation(DesignationDto designationDto);
	 DesignationDto updateDesignation(DesignationDto designationDto, Integer desig_id);
	 DesignationDto getDesignationById(Integer desig_id);
	
	void deleteDesignation(Integer desig_id);

	

}
