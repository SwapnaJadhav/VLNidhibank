package com.vlup.vlnidhibank.service;

import java.util.List;

import com.bank.employeeSection.entities.BankEmployee;
import com.bank.employeeSection.payloads.BankEmployeeDto;

public interface BankEmployeeService
{

	BankEmployeeDto createBankEmployee(BankEmployeeDto bankEmployee);
	
	BankEmployeeDto UpdateBankEmployee(BankEmployeeDto bankEmployee, Integer bankempid);
	
	BankEmployeeDto getBankEmpById(Integer bankempid);
	
	List<BankEmployeeDto> getAllBankEmp();
	
	void deleteBankEmp(Integer bankempid);
	
	
	
	
	
	

}
