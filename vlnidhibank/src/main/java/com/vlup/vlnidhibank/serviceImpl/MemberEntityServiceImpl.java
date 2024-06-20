package com.vlup.vlnidhibank.serviceImpl;

import java.lang.reflect.Member;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberAddressDto;
import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.entity.MemberEntity;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.MemberAddressRepository;
import com.vlup.vlnidhibank.repository.MemberEntityRepository;
import com.vlup.vlnidhibank.service.MemberEntityService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class MemberEntityServiceImpl  implements MemberEntityService{
	
	@Autowired
	private MemberEntityRepository memberRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private MemberEntity convertDtoToEntity(MemberEntityDto memberDto) {
	MemberEntity member=this.modelMapper.map(memberDto, MemberEntity.class);
				return member;
	}
	
	private MemberEntityDto convertEntityToDto(MemberEntity member) {
		MemberEntityDto memberDto=this.modelMapper.map(member, MemberEntityDto.class);
					return memberDto;
		}
		
	@Override
	public MemberEntityDto createMember(MemberEntityDto memberDto) {
		MemberEntity member=convertDtoToEntity(memberDto);
		MemberEntity savedMember=memberRepo.save(member);
		return this.convertEntityToDto(savedMember);
	}
	

	@Override
	public MemberEntityDto updateMember(MemberEntityDto memberDto, Integer memberid) {
		MemberEntity member= this.memberRepo
				      .findById(memberid)
				      .orElseThrow(()->new ResourceNotFoundException("Member","Id",memberid));
		   
		    
		member.setMemberCode(memberDto.getMemberCode());
		member.setRemarks(memberDto.getRemarks());
		member.setStatus(memberDto.getStatus());
		member.setRemarks(memberDto.getRemarks());
		member.setC1(memberDto.getC1());
		member.setC2(memberDto.getC2());
		member.setC3(memberDto.getC3());
		member.setMemberAddress(memberDto.getMemberAddress());
		member.setMemPerDetail(memberDto.getMemPerDetail());
		member.setNominee(memberDto.getNominee());
		
		MemberEntity updateMemberEntity= this.memberRepo.save(member);
	    MemberEntityDto memDto1=this.convertEntityToDto(updateMemberEntity);
		return memDto1;
	}

	
	
	
	@Override
	public List<MemberEntityDto> getAllMember() 
	{
		List<MemberEntity> memEntityList=this.memberRepo.findAll();
		List<MemberEntityDto> listOfMemEntityDtos=memEntityList.stream().map(mElist->this.convertEntityToDto(mElist)).collect(Collectors.toList());
		
		return listOfMemEntityDtos;
	}
	
	

	@Override
	public MemberEntityDto getMemberById(Integer id) {
		MemberEntity member=this.memberRepo
			      .findById(id)
			      .orElseThrow(()->new ResourceNotFoundException("Member","Id",id));
		return this.convertEntityToDto(member);
	}

	
	
	@Override
	public void deleteMember(Integer id) {
		MemberEntity member=this.memberRepo
			      .findById(id)
			      .orElseThrow(()->new ResourceNotFoundException("Member","Id",id));
		this.memberRepo.delete(member);
	}

	

}
