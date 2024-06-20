package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.MemberAddressDto;



public interface MemberAddressService {

	
	List<MemberAddressDto> getAllMemberAddress(); 
	 MemberAddressDto createMemberAddress(MemberAddressDto memPDto);
	 MemberAddressDto updateMemberAddress(MemberAddressDto memPDto, Integer membersid);
	 MemberAddressDto getMemAddressById(Integer id);
	
	void deleteMemberAddress(Integer id);
}
