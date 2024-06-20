package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.dto.NomineeDto;

public interface NomineeService {
	
	List<NomineeDto> getAllNominee(); 
	NomineeDto createNominee(NomineeDto nomineeDto);
	NomineeDto updateNominee(NomineeDto nomineeDto, Integer nomineeid);
	NomineeDto getNomineeById(Integer id);
	
	void deleteNominee(Integer id);

}
