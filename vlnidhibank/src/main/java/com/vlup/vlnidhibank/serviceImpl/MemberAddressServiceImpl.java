package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberAddressDto;
import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.entity.MemberAddress;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.MemberAddressRepository;
import com.vlup.vlnidhibank.service.MemberAddressService;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class MemberAddressServiceImpl implements MemberAddressService {
	
	
	@Autowired
	private MemberAddressRepository memberAddrRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public MemberAddressDto createMemberAddress(MemberAddressDto memberAddrDto) {
		 
		MemberAddress memAddrP = convertDtoToEntity(memberAddrDto);
        MemberAddress savedMemAddrP= memberAddrRepo.save(memAddrP);
        return this.convertEntityToDto(savedMemAddrP);
	}

	
	
	public List<MemberAddressDto> getAllMemberAddress(){
		List<MemberAddress> listOfMemAddr=this.memberAddrRepo.findAll();
        List<MemberAddressDto> listOfMemAddrDtos=listOfMemAddr.stream().map(memAddrlist->this.convertEntityToDto(memAddrlist)).collect(Collectors.toList());
		return listOfMemAddrDtos;
		
	}
	
	public MemberAddressDto getMemAddressById(Integer id) {
		MemberAddress memP= this.memberAddrRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("MemberAddress","Id",id));
    	return this.convertEntityToDto(memP); 
	}
	
	public void deleteMemberAddress(Integer id) {
		MemberAddress memP=this.memberAddrRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("MemberAddress","Id",id));
    	
    	this.memberAddrRepo.delete(memP);
	}
	
	private MemberAddressDto convertEntityToDto(MemberAddress memAddr) {
    	MemberAddressDto memAddrDto=this.modelMapper.map(memAddr,  MemberAddressDto.class);
  	  return  memAddrDto; 
    }

    
    
    private MemberAddress convertDtoToEntity(MemberAddressDto memAddrDto) {
        MemberAddress memAddr=this.modelMapper.map(memAddrDto,  MemberAddress.class);
    	  return  memAddr;
            
    }



	@Override
	public MemberAddressDto updateMemberAddress(MemberAddressDto memAddrDto, Integer memberAddrid) {
		
		MemberAddress memAddr=this.memberAddrRepo
    			.findById(memberAddrid)
    			.orElseThrow(()->new ResourceNotFoundException("MemberDetails","Id",memberAddrid));
	    memAddr.setId(memAddrDto.getId());
		memAddr.setAddress(memAddrDto.getAddress());
		memAddr.setDistrict(memAddrDto.getDistrict());
		memAddr.setState(memAddrDto.getState());
		memAddr.setPincode(memAddrDto.getPincode());
		memAddr.setRationNo(memAddrDto.getRationNo());
		
		
	    MemberAddress updatedmemberAddress= this.memberAddrRepo.save(memAddr);
	    MemberAddressDto memAddrDto1=this.convertEntityToDto(updatedmemberAddress);
		return memAddrDto1;
	}

	

}
