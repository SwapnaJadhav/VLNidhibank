package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.BranchDto;
import com.vlup.vlnidhibank.dto.MemberAddressDto;

public interface BranchService {
	
	 List<BranchDto> getAllBranches(); 
	 BranchDto createBranch(BranchDto memPDto);
	 BranchDto updateBranch(BranchDto memPDto, Integer branchid);
	 BranchDto getBranchById(Integer id);
	
	void deleteBranch(Integer id);

}
