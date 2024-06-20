package com.vlup.vlnidhibank.service;

import java.util.List;

import com.BankingApp.DTO.AdvisorDTO;

public interface AdvisorService {
	 
	    AdvisorDTO createAdvisor(AdvisorDTO advisor);
	    
	    AdvisorDTO getAdvisorById(Integer advisor);

	    List<AdvisorDTO> getAllAdvisors();

	    AdvisorDTO updateAdvisor(AdvisorDTO advisor,Integer advisorCode);

	    void deleteAdvisor(Integer advisorCode);
}


