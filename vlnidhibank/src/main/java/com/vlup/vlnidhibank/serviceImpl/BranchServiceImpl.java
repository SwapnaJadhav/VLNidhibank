package com.vlup.vlnidhibank.serviceImpl;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.BranchDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.BranchRepository;
import com.vlup.vlnidhibank.service.BranchService;


@Service
public class BranchServiceImpl implements BranchService {

	
	@Autowired
	private BranchRepository branchRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private BranchDto convertEntityToDto(Branch branch) {
    	BranchDto branchDto=this.modelMapper.map(branch, BranchDto.class);
  	  return  branchDto; 
    }

    
    
    private Branch convertDtoToEntity(BranchDto branchDto) {
        Branch branch=this.modelMapper.map(branchDto,  Branch.class);
    	  return  branch;
}

	@Override
	public List<BranchDto> getAllBranches() {
		List<Branch> branchList=this.branchRepo.findAll();	
     List<BranchDto> listOfBranchDtos=branchList.stream().map(branchlist->this.convertEntityToDto(branchlist)).collect(Collectors.toList()); 
        return listOfBranchDtos;
	}

	@Override
	public BranchDto createBranch(BranchDto branchDto) {
		
		Branch branch = convertDtoToEntity(branchDto);
        Branch savedBranch= branchRepo.save(branch);
        return this.convertEntityToDto(savedBranch);
	
	}

	@Override
	public BranchDto updateBranch(BranchDto branchDto, Integer branchid) {
		Branch branch=this.branchRepo
    			.findById(branchid)
    			.orElseThrow(()->new ResourceNotFoundException("Branch","Id",branchid));
   
		branch.setBranchCode(branchDto.getBranchCode());
		branch.setBranchName(branchDto.getBranchName());
		branch.setOpeningDate(branchDto.getOpeningDate());
		branch.setBranchAddress(branchDto.getBranchAddress());
		branch.setPin(branchDto.getPin());
		branch.setBranchState(branchDto.getBranchState());
		branch.setCity(branchDto.getBranchCity());
		branch.setContactPersonName(branchDto.getContactPersonName());
		branch.setContactNo(branchDto.getContactNo());
		branch.setCspCode(branchDto.getCspCode());
		branch.setShareDetail(branchDto.getShareDetail());
		
	    Branch updateBranch= this.branchRepo.save(branch);
	    BranchDto branchPDto1=this.convertEntityToDto(updateBranch);
	    
	    return branchPDto1;
	}

	@Override
	public BranchDto getBranchById(Integer id) {
		Branch branch= this.branchRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Branch","Id",id));
    	return this.convertEntityToDto(branch); 
	}

	@Override
	public void deleteBranch(Integer id) {
		Branch branch=this.branchRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Branch","Id",id));
    	
    	this.branchRepo.delete(branch);
		
	}

}
