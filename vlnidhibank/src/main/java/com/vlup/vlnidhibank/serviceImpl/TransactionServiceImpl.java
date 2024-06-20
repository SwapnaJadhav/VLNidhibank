package com.vlup.vlnidhibank.serviceImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.dto.TransactionDto;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.Transaction;
import com.vlup.vlnidhibank.enums.TransactionStatus;
import com.vlup.vlnidhibank.enums.TransactionType;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.TransactionRepository;
import com.vlup.vlnidhibank.service.TransactionService;


@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepo; 
	
	@Autowired
	private ModelMapper modelMapper;


	private TransactionDto convertEntityToDto(Transaction transaction) {
		TransactionDto transactionDto=this.modelMapper.map(transaction, TransactionDto.class);
  	  return  transactionDto; 
    }

        
    private Transaction convertDtoToEntity(TransactionDto transactionDto) {
    	Transaction transaction=this.modelMapper.map(transactionDto,  Transaction.class);
    	  return  transaction;
    }
	
	@Override
	public List<TransactionDto> getTransactions() {
		List<Transaction> transList=this.transactionRepo.findAll();
		List<TransactionDto> listOfTransDtos=transList.stream().map(tList->this.convertEntityToDto(tList)).collect(Collectors.toList());

		return listOfTransDtos;
	}
	
	@Override
	public TransactionDto createTransaction(TransactionDto transactionDto) {
		       Transaction trans=convertDtoToEntity(transactionDto);
		       Transaction savedTrans=transactionRepo.save(trans);
		return this.convertEntityToDto(savedTrans);
	}

	@Override
	public TransactionDto updateTransaction(TransactionDto transactionDto, Integer transactionId) {
		 Transaction trans=this.transactionRepo
		          .findById(transactionId)
		          .orElseThrow(()-> new ResourceNotFoundException("Transaction","Id",transactionId));
		    
		    trans.setAmount(transactionDto.getAmount());
		    trans.setTransactionDate(transactionDto.getTransactionDate());
		    trans.setType(transactionDto.getType());
		    trans.setStatus(transactionDto.getStatus());
		    trans.setDescription(transactionDto.getDescription());
		    trans.setSourceAccountId(transactionDto.getSourceAccountId());
		    trans.setCurrency(transactionDto.getCurrency());
		    trans.setCreatedAt(transactionDto.getCreatedAt());
		    trans.setUpdatedAt(transactionDto.getUpdatedAt());
		    trans.setLocation(transactionDto.getLocation());
		    trans.setTransactionFee(transactionDto.getTransactionFee());
		    trans.setPaymentMethod(transactionDto.getPaymentMethod());
		    trans.setTransactionReference(transactionDto.getTransactionReference());
		   // trans.setTransactionFee(transactionDto.getTransactionFee());
		    
		 Transaction updateTrans= this.transactionRepo.save(trans);
		 TransactionDto transPDto1=this.convertEntityToDto(updateTrans);
		         
		return transPDto1;
	}
	
	@Override
	public TransactionDto getTransactionById(Integer id) {
        Transaction trans=this.transactionRepo
        		          .findById(id)
        		          .orElseThrow(()-> new ResourceNotFoundException("Transaction","Id",id));
		return this.convertEntityToDto(trans);
	}

	
	@Override
	public void deleteTransaction(Integer id) {
		Transaction transaction=this.transactionRepo
				.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Transaction","Id",id));
		this.transactionRepo.delete(transaction);
	}

}
