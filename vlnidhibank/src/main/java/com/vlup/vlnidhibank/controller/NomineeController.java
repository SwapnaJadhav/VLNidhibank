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
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.service.NomineeService;

@RestController
@RequestMapping("api/nominee")
public class NomineeController {

	@Autowired
	private NomineeService nomineeService;
	
	
	@PostMapping("/")
	public ResponseEntity<NomineeDto> createNominee(@RequestBody NomineeDto nomineeDto)
	{
		NomineeDto nomineeDtos= this.nomineeService.createNominee(nomineeDto);
		
		return new ResponseEntity<>(nomineeDtos,HttpStatus.CREATED);
	}
	
	@PutMapping("/{nomineeDtoId}")
	public ResponseEntity<NomineeDto> updateNominee(@RequestBody NomineeDto nomineeDto,@PathVariable Integer nomineeDtoId)
	{     
		NomineeDto updatedNomineeDto=this.nomineeService.updateNominee(nomineeDto, nomineeDtoId);
		return ResponseEntity.ok(updatedNomineeDto);
	}
	
	@DeleteMapping("/{nomineeDtoId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer nomineeDtoId){
		this.nomineeService.deleteNominee(nomineeDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("Nominee deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<NomineeDto>> getallMemAddress(){
		
		return ResponseEntity.ok(this.nomineeService.getAllNominee());
	}
	
	@GetMapping("/{nomineeDtoId}")
	public ResponseEntity<NomineeDto> getMemAddrById(@PathVariable Integer nomineeDtoId){
		
		return ResponseEntity.ok(this.nomineeService.getNomineeById(nomineeDtoId));
	}
}
