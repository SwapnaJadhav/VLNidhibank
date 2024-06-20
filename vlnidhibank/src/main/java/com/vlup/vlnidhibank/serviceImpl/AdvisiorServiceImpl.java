package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.DTO.*;
import com.BankingApp.entities.Advisor;
import com.BankingApp.exceptions.ResourceNotFoundException;
import com.BankingApp.repositories.AdvisorRepository;
import com.BankingApp.services.AdvisorService;


@Service
public class AdvisiorServiceImpl implements AdvisorService {

	@Autowired
	private AdvisorRepository  advisorRepo;
	
  
	
	
	@Override
	public AdvisorDTO createAdvisor(AdvisorDTO advisor) {
		
		Advisor adv=dtoToAdvisor(advisor);
		Advisor savedAdv=advisorRepo.save(adv);
		return  advisorToDto(savedAdv);
	}

	@Override
	public AdvisorDTO getAdvisorById(Integer advisorCode) {
		
		Advisor advisor = this.advisorRepo.findById(advisorCode)
				.orElseThrow(()-> new ResourceNotFoundException("Advisor","advisorCode",advisorCode));
		

		
		   advisor.setPhotoUrl(advisor.getPhotoUrl());
		    advisor.setSignatureUrl(advisor.getSignatureUrl());

		    Advisor advisorUpdated = advisorRepo.save(advisor);
		    return advisorToDto(advisorUpdated);
	}
	  

	@Override
	public List<AdvisorDTO> getAllAdvisors() {
		
		List<Advisor> advisors=this.advisorRepo.findAll();
		List<AdvisorDTO>listOfAdvisor = advisors.stream().map(AL ->this.advisorToDto(AL)).collect(Collectors.toList());

		return listOfAdvisor;
	}

	@Override
	public AdvisorDTO updateAdvisor(AdvisorDTO advisordto, Integer advisorCode) {
		
		Advisor advisor =this.advisorRepo.findById(advisorCode)
				.orElseThrow(()-> new ResourceNotFoundException("Advisor","advisorCode",advisorCode));
		
		advisor.setAdvisorFirstName(advisordto.getAdvisorFirstName());
		advisor.setAdvisorLastName(advisordto.getAdvisorLastName());
		advisor.setBranchName(advisordto.getBranchName());
		advisor.setCode(advisordto.getCode());
		advisor.setIntroducerName(advisordto.getIntroducerName());		
		
		Advisor advisorUpdated =this.advisorRepo.save(advisor);
		AdvisorDTO advisorDto1 = this.advisorToDto(advisorUpdated);
		
		
		return advisorDto1;
	}

	@Override
	public void deleteAdvisor(Integer advisorCode) {
		
		this.advisorRepo.findById(advisorCode)
		.orElseThrow(()-> new ResourceNotFoundException("Advisor","advisorCode",advisorCode));
		
	}

	private Advisor dtoToAdvisor(AdvisorDTO advDTO) {
		Advisor advisor =new Advisor();
		 advisor.setCode(advDTO.getCode());
		advisor.setAdvisorFirstName(advDTO.getAdvisorFirstName());
		advisor.setAdvisorLastName(advDTO.getAdvisorLastName());
		advisor.setBranchName(advDTO.getBranchName());
		advisor.setIntroducerName(advDTO.getIntroducerName());
		advisor.setIntroducerCode(advDTO.getIntroducerCode());
		
		return advisor;
	
	}
	
	private AdvisorDTO advisorToDto(Advisor advisor) {
	    AdvisorDTO advDTO = new AdvisorDTO();
	    advDTO.setAdvisorCode(advisor.getAdvisorCode());
	    advDTO.setCode(advisor.getCode());
	    advDTO.setAdvisorFirstName(advisor.getAdvisorFirstName());
	    advDTO.setAdvisorLastName(advisor.getAdvisorLastName());
	    advDTO.setBranchName(advisor.getBranchName());
	    advDTO.setIntroducerCode(advisor.getIntroducerCode());
	    advDTO.setIntroducerName(advisor.getIntroducerName());
	    return advDTO;
	}

	
}
