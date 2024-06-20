package com.vlup.vlnidhibank.service;

import java.util.List;

import com.bank.employeeSection.payloads.AccountDto;



public interface AccountService {

	 List<AccountDto> getAllAccounts(); 
	 AccountDto createAccount(AccountDto accountDto);
	 AccountDto updateAccount(AccountDto accountDto, Integer accId);
	 AccountDto getAccountById(Integer accId);
	
	void deleteAccount(Integer accId);

}
