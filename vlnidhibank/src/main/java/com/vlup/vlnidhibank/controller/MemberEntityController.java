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
import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.service.MemberEntityService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("api/members")
public class MemberEntityController {
      
	@Autowired
	private MemberEntityService memberService;
	
	
//	@PostMapping("/")
//	public  ResponseEntity<ApiResponse> createMember(@RequestBody MemberEntityDto memberDto){
//		          this.memberService.createMember(memberDto);
//		return new ResponseEntity<ApiResponse>(new ApiResponse ("Member created Successfully",true),HttpStatus.CREATED);
//	}
	
	@PostMapping("/")
	public ResponseEntity<MemberEntityDto> createMember(@RequestBody MemberEntityDto memberDto)
	{
		MemberEntityDto memberDtos= this.memberService.createMember(memberDto);
		
		return new ResponseEntity<>(memberDtos,HttpStatus.CREATED);
	}
	
	@PutMapping("/{memDtoId}")
	public ResponseEntity<ApiResponse> updateMember(@RequestBody MemberEntityDto memDto,@PathVariable Integer memDtoId)
	{     
		this.memberService.updateMember(memDto, memDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("Member updated Successfully",true),HttpStatus.OK);
	}
	
	@DeleteMapping("/{memDtoId}")
	public ResponseEntity<ApiResponse> deleteMember(@PathVariable Integer memDtoId){
		this.memberService.deleteMember(memDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("Member deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<MemberEntityDto>> getallMembers(){
		
		return ResponseEntity.ok(this.memberService.getAllMember());
	}
	
	@GetMapping("/{memDtoId}")
	public ResponseEntity<MemberEntityDto> getMemberById(@PathVariable Integer memDtoId){
		
		return ResponseEntity.ok(this.memberService.getMemberById(memDtoId));
	}
	
	
}
