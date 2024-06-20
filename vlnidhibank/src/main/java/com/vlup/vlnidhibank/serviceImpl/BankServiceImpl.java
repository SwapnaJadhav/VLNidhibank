package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.employeeSection.entities.Bank;

import com.bank.employeeSection.exceptions.ResourceNotFoundException;
import com.bank.employeeSection.payloads.BankDto;

import com.bank.employeeSection.repositories.BankRepository;
import com.bank.employeeSection.services.BankService;


//@SuppressWarnings("unused")
@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepository bankRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private BankDto convertEntityToDto(Bank bank) {
    	BankDto bankDto=this.modelMapper.map(bank, BankDto.class);
  	  return bankDto; 
    }

    
    
    private Bank convertDtoToEntity(BankDto bankDto) {
        Bank bank=this.modelMapper.map(bankDto, Bank.class);
    	  return bank;
     }

	@Override
	public List<BankDto> getAllBanksDeatails() {
		List<Bank> bankDetailsList = this.bankRepo.findAll();
		List<BankDto> listOfBankDetails = bankDetailsList.stream().map(bankDetail->this.convertEntityToDto(bankDetail)).collect(Collectors.toList());
		return listOfBankDetails;
	}

	@Override
	public BankDto createBank(BankDto bankDto) {
		Bank bank = convertDtoToEntity(bankDto);
        Bank savedBank= bankRepo.save(bank);
        return this.convertEntityToDto(savedBank);
	}

	@Override
	public BankDto updateBank(BankDto bankDto, Integer bank_id) {
		Bank bank=this.bankRepo
    			.findById(bank_id)
    			.orElseThrow(()->new ResourceNotFoundException("Bank","Id", bank_id));
		
	   bank.setBankName(bankDto.getBankName());
//	   bank.setAccountNo(bankDto.getAccountNo());
//	   bank.setIfscCode(bankDto.getIfscCode());
	   bank.setMobileNo(bankDto.getMobileNo());
	   bank.setAddress(bankDto.getAddress());
	   bank.setCountry(bankDto.getCountry());
	   bank.setCity(bankDto.getCity());
	   bank.setOpeningdate(bankDto.getOpeningdate());
	   bank.setBalance(bankDto.getBalance());
	   Bank updateBankDetails = this.bankRepo.save(bank);
	   BankDto bankDetails = this.convertEntityToDto(updateBankDetails);
	   return bankDetails;
		   
	}

	@Override
	public BankDto getBankById(Integer bank_id) {
		Bank bank= this.bankRepo
    			.findById(bank_id).orElseThrow(()->new ResourceNotFoundException("Bank","Id",bank_id));
    	return this.convertEntityToDto(bank); 
	}

	@Override
	public void deleteBankDetails(Integer bank_id) {
		Bank bank=this.bankRepo
    			.findById(bank_id)

    			.orElseThrow(()->new ResourceNotFoundException("Bank","Id",bank_id));
    	
    	this.bankRepo.delete(bank);
		
	}
		
}
