package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.NomineeRepository;
import com.vlup.vlnidhibank.service.NomineeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NomineeServiceImpl  implements NomineeService{

	
	@Autowired
	private NomineeRepository nomineeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	private NomineeDto convertEntityToDto(Nominee nominee) {
    	NomineeDto nomineeDto=this.modelMapper.map(nominee, NomineeDto.class);
  	  return  nomineeDto; 
    }

    
    
    private Nominee convertDtoToEntity(NomineeDto nomineeDto) {
        Nominee nominee=this.modelMapper.map(nomineeDto,  Nominee.class);
    	  return  nominee;
}



	@Override
	public List<NomineeDto> getAllNominee() {
		List<Nominee> nomineeList=this.nomineeRepo.findAll();
        List<NomineeDto> listOfNomineeDtos=nomineeList.stream().map(nomlist->this.convertEntityToDto(nomlist)).collect(Collectors.toList());
        
        return listOfNomineeDtos;
	}



	@Override
	public NomineeDto createNominee(NomineeDto nomineeDto) {
		Nominee nominee = convertDtoToEntity(nomineeDto);
        Nominee savedNominee= nomineeRepo.save(nominee);
        return this.convertEntityToDto(savedNominee);
	}



	@Override
	public NomineeDto updateNominee(NomineeDto nomineeDto, Integer nomineeid) {
		Nominee nominee=this.nomineeRepo
    			.findById(nomineeid)
    			.orElseThrow(()->new ResourceNotFoundException("Nominee","Id",nomineeid));
    	
		nominee.setNomineeName((nomineeDto.getNomineeName()));
		nominee.setNomineeRelation((nomineeDto.getNomineeRelation()));
		nominee.setMobileNo((nomineeDto.getMobileNo()));
		nominee.setAge((nomineeDto.getAge()));
		nominee.setPanNo((nomineeDto.getPanNo()));
		nominee.setAddress((nomineeDto.getAddress()));
		nominee.setNomineeKycType(nomineeDto.getNomineeKycType());  
		
	    Nominee updateNominee= this.nomineeRepo.save(nominee);
	    NomineeDto nomineePDto1=this.convertEntityToDto(updateNominee);
	    
	    return nomineePDto1;
    } 
	



	@Override
	public NomineeDto getNomineeById(Integer id) {
		Nominee nominee= this.nomineeRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Nominee","Id",id));
    	return this.convertEntityToDto(nominee); 
	}



	@Override
	public void deleteNominee(Integer id) {
		Nominee nominee=this.nomineeRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Nominee","Id",id));
    	
    	this.nomineeRepo.delete(nominee);
		
	}
}