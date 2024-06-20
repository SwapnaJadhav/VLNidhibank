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
import com.vlup.vlnidhibank.dto.MemberAddressDto;
import com.vlup.vlnidhibank.service.MemberAddressService;


@RestController
@RequestMapping("api/address")
public class MemberAddressController {
	
	@Autowired
	private MemberAddressService memAddrService;
	
	
	@PostMapping("/")
	public ResponseEntity<MemberAddressDto> createMemAddress(@RequestBody MemberAddressDto memAddrDto)
	{
		MemberAddressDto createMemAddrDto= this.memAddrService.createMemberAddress(memAddrDto);
		
		return new ResponseEntity<>(createMemAddrDto,HttpStatus.CREATED);
	}
	
	@PutMapping("/{memAddrDtoId}")
	public ResponseEntity<MemberAddressDto> updateMemberAddr(@RequestBody MemberAddressDto memAddrDto,@PathVariable Integer memAddrDtoId)
	{     
		MemberAddressDto updatedMemAddrDto=this.memAddrService.updateMemberAddress(memAddrDto, memAddrDtoId);
		return ResponseEntity.ok(updatedMemAddrDto);
	}
	
	
	@DeleteMapping("/{memAddrDtoId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer memAddrDtoId){
		this.memAddrService.deleteMemberAddress(memAddrDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("Member Address deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<MemberAddressDto>> getallMemAddress(){
		
		return ResponseEntity.ok(this.memAddrService.getAllMemberAddress());
	}
	
	@GetMapping("/{memAddrDtoId}")
	public ResponseEntity<MemberAddressDto> getMemAddrById(@PathVariable Integer memAddrDtoId){
		
		return ResponseEntity.ok(this.memAddrService.getMemAddressById(memAddrDtoId));
	}
	

}
