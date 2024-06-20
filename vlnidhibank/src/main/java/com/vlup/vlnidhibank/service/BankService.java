package com.vlup.vlnidhibank.service;

import java.util.List;
import com.bank.employeeSection.entities.*;
import com.bank.employeeSection.payloads.BankDto;

public interface BankService {
	 List<BankDto> getAllBanksDeatails(); 
	 BankDto createBank(BankDto bankDto);
	 BankDto updateBank(BankDto bankDto, Integer bank_id);
	
	void deleteBankDetails(Integer bank_id);
	BankDto getBankById(Integer bank_id);

}
