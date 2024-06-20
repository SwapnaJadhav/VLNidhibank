package com.vlup.vlnidhibank.controller;

import java.util.List;
import java.util.Map;

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
import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.service.MemberPersonalDetailService;

@RestController
@RequestMapping("api/membersPDetail")
public class MemberPersonalDetailController {
        
	@Autowired
	private MemberPersonalDetailService memberPService;
	
	
	@PostMapping("/")
	public ResponseEntity<MemberPersonalDetailDto> createMemberPDetail(@RequestBody MemberPersonalDetailDto memPDto)
	{
		MemberPersonalDetailDto createMemPDto= this.memberPService.createMemPersonalDetail(memPDto);
		
		return new ResponseEntity<>(createMemPDto,HttpStatus.CREATED);
	}
	
	@PutMapping("/{memPDtoId}")
	public ResponseEntity<MemberPersonalDetailDto> updateMemberPDetail(@RequestBody MemberPersonalDetailDto memPDto,@PathVariable Integer memPDtoId)
	{     
		MemberPersonalDetailDto updatedPdDto=this.memberPService.updateMemPersonalDetail(memPDto, memPDtoId);
		return ResponseEntity.ok(updatedPdDto);
	}
	
	
	@DeleteMapping("/{memPDtoId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer memPDtoId){
		this.memberPService.deleteMember(memPDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("User deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<MemberPersonalDetailDto>> getallMemPDetails(){
		
		return ResponseEntity.ok(this.memberPService.getAllMembersPDetail());
	}
	
	@GetMapping("/{memPDtoId}")
	public ResponseEntity<MemberPersonalDetailDto> getMemPDetailById(@PathVariable Integer memPDtoId){
		
		return ResponseEntity.ok(this.memberPService.getMemberPDetailById(memPDtoId));
	}
	
	
}
