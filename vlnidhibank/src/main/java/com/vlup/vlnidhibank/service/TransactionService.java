package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.TransactionDto;

public interface TransactionService {

	List<TransactionDto> getTransactions(); 
	TransactionDto createTransaction(TransactionDto transactionDto);
	TransactionDto updateTransaction(TransactionDto transactionDto, Integer transactionId);
	TransactionDto getTransactionById(Integer id);
	
	void deleteTransaction(Integer id);
}
