package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.dto.ShareDetailDto;

public interface ShareDetailService {

	List<ShareDetailDto> getAllShareDetails(); 
	ShareDetailDto createShareDetail(ShareDetailDto ShareDetailDto);
	ShareDetailDto updateShareDetail(ShareDetailDto shareDetailDto, Integer ShareDetailid);
	ShareDetailDto getShareDetailById(Integer id);
	
	void deleteShareDetail(Integer id);
}
