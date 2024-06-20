package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.employeeSection.entities.Account;
import com.bank.employeeSection.exceptions.ResourceNotFoundException;
import com.bank.employeeSection.payloads.AccountDto;
import com.bank.employeeSection.repositories.AccountRepo;
import com.bank.employeeSection.services.AccountService;


@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	

	private AccountDto convertEntityToDto(Account account) {
		AccountDto accountDto=this.modelMapper.map(account, AccountDto.class);
  	  return  accountDto; 
    }

    
    
    private Account convertDtoToEntity(AccountDto accountDto) {
        Account account=this.modelMapper.map(accountDto, Account.class);
    	  return  account;
     }


	@Override
	public List<AccountDto> getAllAccounts() {
		List<Account> accountList=this.accountRepo.findAll();
        List<AccountDto> listOfAccountDtos=accountList.stream().map(accountlist->this.convertEntityToDto(accountlist)).collect(Collectors.toList()); 
        return listOfAccountDtos;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = convertDtoToEntity(accountDto);
		Account savedAccount= accountRepo.save(account);
        return this.convertEntityToDto(savedAccount);
	}

	@Override
	public AccountDto updateAccount(AccountDto accountDto, Integer accId) {
		Account account=this.accountRepo
    			.findById(accId)
    			.orElseThrow(()->new ResourceNotFoundException("Account","Id",accId));
		
		
		// Update by 
		account.setAccHolderName(accountDto.getAccHolderName());
		account.setOpeningBalance(accountDto.getOpeningBalance());
   

		
	    Account updateAccount= this.accountRepo.save(account);
	    AccountDto accDto1=this.convertEntityToDto(updateAccount);
	    
	    return accDto1;
	}

	@Override
	public AccountDto getAccountById(Integer accId) {
		Account account= this.accountRepo
    			.findById(accId)
                .orElseThrow(()->new ResourceNotFoundException("Account","Id",accId));
    	return this.convertEntityToDto(account);
	}

	@Override
	public void deleteAccount(Integer accId) {
		Account account=this.accountRepo
    			.findById(accId)

    			.orElseThrow(()->new ResourceNotFoundException("Account","Id",accId));
    	
    	this.accountRepo.delete(account);
		
	}

}
