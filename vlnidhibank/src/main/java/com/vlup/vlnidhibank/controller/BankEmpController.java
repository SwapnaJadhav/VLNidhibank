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

import com.bank.employeeSection.payloads.BankEmployeeDto;
import com.bank.employeeSection.services.BankEmployeeService;

@RestController
@RequestMapping("api/bankEmployees")
public class BankEmpController {
	
	@Autowired
	private BankEmployeeService bankEmpService;
	
	
	// POST - Create BankEmp
	@PostMapping("/")
	public ResponseEntity<BankEmployeeDto> createBankEmp(@RequestBody BankEmployeeDto bankEmployeeDto){
		BankEmployeeDto createBankEmpDto = this.bankEmpService.createBankEmployee(bankEmployeeDto);
		return new ResponseEntity<>(createBankEmpDto, HttpStatus.CREATED);
	}
	
//	@PostMapping("/")
//	public ResponseEntity<BankEmployeeDto> createBankEmp(@RequestBody BankEmployeeDto bankEmployeeDto){
//		BankEmployeeDto createBankEmpDto = this.bankEmpService.createBankEmployee(bankEmployeeDto);
//		return new ResponseEntity<>(createBankEmpDto, HttpStatus.CREATED);
//		
//	}
	
	
	//PUT - Update BankEmp
	@PutMapping("/{bankempid}")
	public ResponseEntity<BankEmployeeDto> updateBankEmp(@RequestBody BankEmployeeDto bankEmployeeDto, @PathVariable Integer bankempid)
    {
    	BankEmployeeDto updatedBamkEmp = this.bankEmpService.UpdateBankEmployee(bankEmployeeDto, bankempid);
    	return ResponseEntity.ok(updatedBamkEmp);
		
	}
	
	
	// DELETE - Delete BankEmp
    @DeleteMapping("/{bankempid}")
    public ResponseEntity<?> deleteBankEmp(@PathVariable Integer bankempid)
    {
    	this.bankEmpService.deleteBankEmp(bankempid);
    	return new ResponseEntity(Map.of("message", "User deleted Successfully"), HttpStatus.OK);
    }
    
	
	
	// GET - Get All BankEmp
    @GetMapping("/")
    public ResponseEntity<List<BankEmployeeDto>> getAllBankEmp()
    {
    	return ResponseEntity.ok(this.bankEmpService.getAllBankEmp());
    }
    
	// GET - Get Single BankEmp
    @GetMapping("/{bankempid}")
    public ResponseEntity<BankEmployeeDto> getSingleBankEmp(@PathVariable Integer bankempid)
    {
    	return ResponseEntity.ok(this.bankEmpService.getBankEmpById(bankempid));
    }
	

}
