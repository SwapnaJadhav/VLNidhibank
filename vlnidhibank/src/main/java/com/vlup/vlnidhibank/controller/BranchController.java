package com.vlup.vlnidhibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlup.vlnidhibank.dto.ApiResponse;
import com.vlup.vlnidhibank.dto.BranchDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.service.BranchService;

@RestController
@RequestMapping("api/branch")
public class BranchController {

	
	@Autowired
	private BranchService branchService;
	
	
	@PostMapping("/")
	public ResponseEntity<BranchDto> createBranch(@RequestBody BranchDto branchDto)
	{
		BranchDto branchDtos= this.branchService.createBranch(branchDto);
		
		return new ResponseEntity<>(branchDtos,HttpStatus.CREATED);
	}
	
	@PutMapping("/{branchDtoId}")
	public ResponseEntity<BranchDto> updateBranch(@RequestBody BranchDto branchDto,@PathVariable Integer branchDtoId)
	{     
		BranchDto updatedBranchDto=this.branchService.updateBranch(branchDto, branchDtoId);
		return ResponseEntity.ok(updatedBranchDto);
	}
	
	@DeleteMapping("/{branchDtoId}")
	public ResponseEntity<ApiResponse> deleteBranch(@PathVariable Integer branchDtoId){
		this.branchService.deleteBranch(branchDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("Branch deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<BranchDto>> getallBranches(){
		
		return ResponseEntity.ok(this.branchService.getAllBranches());
	}
	
	@GetMapping("/{branchDtoId}")
	public ResponseEntity<BranchDto> getBranchById(@PathVariable Integer branchDtoId){
		
		return ResponseEntity.ok(this.branchService.getBranchById(branchDtoId));
	}
}
