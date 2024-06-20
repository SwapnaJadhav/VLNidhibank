package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.MemberPersonalDetailRepository;
import com.vlup.vlnidhibank.service.MemberPersonalDetailService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Service
@AllArgsConstructor
public class MemberPersonalDetailServiceImpl  implements MemberPersonalDetailService{

	
	@Autowired
    private MemberPersonalDetailRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;

	
    public List<MemberPersonalDetailDto> getAllMembersPDetail() {
         List<MemberPersonalDetail> listOfMemPDeatil=this.repository.findAll();
         List<MemberPersonalDetailDto> listOfMemPDtos=listOfMemPDeatil.stream().map(memPlist->this.convertEntityToDto(memPlist)).collect(Collectors.toList());
         
         return listOfMemPDtos;
    }

    public MemberPersonalDetailDto getMemberPDetailById(Integer id) {
    	MemberPersonalDetail memP= this.repository
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("MemberDetails","Id",id));
    	return this.convertEntityToDto(memP); 
    }
    
   
    @Override
    public MemberPersonalDetailDto createMemPersonalDetail(MemberPersonalDetailDto memPDto) {
        MemberPersonalDetail memP = convertDtoToEntity(memPDto);
        MemberPersonalDetail savedMemP= repository.save(memP);
        return this.convertEntityToDto(savedMemP);
    }

    
    @Override
    public MemberPersonalDetailDto updateMemPersonalDetail(MemberPersonalDetailDto memPDto, Integer membersid) {
    	MemberPersonalDetail memP=this.repository
    			.findById(membersid)
    			.orElseThrow(()->new ResourceNotFoundException("MemberDetails","Id",membersid));
    	
    	memP.setMemberName(memPDto.getMemberName());
    	memP.setRegistrationDate(memPDto.getRegistrationDate());
	    memP.setGender(memPDto.getGender());
	    memP.setDob(memPDto.getDob());
	    memP.setAge(memPDto.getAge());
	    memP.setMaritalStatus(memPDto.getMaritalStatus());
	    memP.setAadharNo(memPDto.getAadharNo());
	    memP.setPanNo(memPDto.getPanNo());
	    memP.setVoterId(memPDto.getVoterId());
	    memP.setDrivingLiscNo(memPDto.getDrivingLiscNo());
	    memP.setMobileNo(memPDto.getMobileNo());
	    memP.setEmailId(memPDto.getEmailId());
	    memP.setOccupation(memPDto.getOccupation());
	    memP.setEducation(memPDto.getEducation());
	  
    	
	    MemberPersonalDetail updatedmember= this.repository.save(memP);
	    MemberPersonalDetailDto memPDto1=this.convertEntityToDto(updatedmember);
	    
	    return memPDto1;
    } 
    
    public void deleteMember(Integer id) {
    	MemberPersonalDetail memP=this.repository
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Members","Id",id));
    	
    	this.repository.delete(memP);
    }

    
    private MemberPersonalDetailDto convertEntityToDto(MemberPersonalDetail memP) {
    	MemberPersonalDetailDto memPDto=this.modelMapper.map(memP,  MemberPersonalDetailDto.class);
  	  return  memPDto; 
    }

    
    
    private MemberPersonalDetail convertDtoToEntity(MemberPersonalDetailDto memPDto) {
        MemberPersonalDetail memP=this.modelMapper.map(memPDto,  MemberPersonalDetail.class);
    	  return  memP;
            
    }
}
