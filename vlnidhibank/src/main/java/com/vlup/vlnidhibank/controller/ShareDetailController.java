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

import com.vlup.vlnidhibank.dto.ShareDetailDto;

import com.vlup.vlnidhibank.service.ShareDetailService;

@RestController
@RequestMapping("api/shareDetail")
public class ShareDetailController {

	
	@Autowired
	private ShareDetailService sharedetailService;
	
	@PostMapping("/")
	public ResponseEntity<ShareDetailDto> createShareDetail(@RequestBody ShareDetailDto shareDeDto)
	{
		ShareDetailDto shareDeDtos = this.sharedetailService.createShareDetail(shareDeDto);
		
		return new ResponseEntity<>(shareDeDtos,HttpStatus.CREATED);
	}
	
	@PutMapping("/{shareDeDtoId}")
	public ResponseEntity<ShareDetailDto> updateShareDetail(@RequestBody ShareDetailDto shareDetailDto,@PathVariable Integer shareDeDtoId)
	{     
		ShareDetailDto updatedShareDetailDto=this.sharedetailService.updateShareDetail(shareDetailDto, shareDeDtoId);
		return ResponseEntity.ok(updatedShareDetailDto);
	}
	
	@DeleteMapping("/{shareDeDtoId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer shareDeDtoId){
		this.sharedetailService.deleteShareDetail(shareDeDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("shareDetails deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<ShareDetailDto>> getallMemAddress(){
		
		return ResponseEntity.ok(this.sharedetailService.getAllShareDetails());
	}
	
	@GetMapping("/{shareDeDtoId}")
	public ResponseEntity<ShareDetailDto> getMemAddrById(@PathVariable Integer shareDeDtoId){
		
		return ResponseEntity.ok(this.sharedetailService.getShareDetailById(shareDeDtoId));
	}
	
}
