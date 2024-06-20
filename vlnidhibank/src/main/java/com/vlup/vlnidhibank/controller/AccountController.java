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

import com.bank.employeeSection.payloads.AccountDto;
import com.bank.employeeSection.payloads.Apiresponse;

import com.bank.employeeSection.services.AccountService;

@RestController
@RequestMapping("api/account")
public class AccountController {
	
	@Autowired
	private com.vlup.vlnidhibank.service.AccountService accountService;
	
	@PostMapping("/")
	public ResponseEntity<com.vlup.vlnidhibank.dto.AccountDto> createAccount(@RequestBody com.vlup.vlnidhibank.dto.AccountDto accountDto)
	{
		com.vlup.vlnidhibank.dto.AccountDto accountDtos = this.accountService.createAccount(accountDto);
		
		return new ResponseEntity<>(accountDtos, HttpStatus.CREATED);
	}
	
	@PutMapping("/{accDtoId}")
	public ResponseEntity<AccountDto> updateAccount(@RequestBody AccountDto accountDto, @PathVariable Integer accDtoId)
	{     
		AccountDto updatedAccountDto=this.accountService.updateAccount(accountDto, accDtoId);
		return ResponseEntity.ok(updatedAccountDto);
	}
	
	@DeleteMapping("/{accDtoId}")
	public ResponseEntity<Apiresponse> deleteAccount(@PathVariable Integer accDtoId){
		this.accountService.deleteAccount(accDtoId);
		return new ResponseEntity<Apiresponse>(new Apiresponse ("Account deleted Successfully",true), HttpStatus.OK);
	} 
	
	// Get All Accounts
	@GetMapping("/")
	public ResponseEntity<List<AccountDto>> getallAccounts(){
		
		return ResponseEntity.ok(this.accountService.getAllAccounts());
	}
	
	
	// Get A Single Account
	@GetMapping("/{accDtoId}")
	public ResponseEntity<AccountDto> getAccById(@PathVariable Integer accDtoId){
		
		return ResponseEntity.ok(this.accountService.getAccountById(accDtoId));
	}

}
