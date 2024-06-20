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
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.dto.TransactionDto;
import com.vlup.vlnidhibank.entity.Transaction;
import com.vlup.vlnidhibank.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {


	  @Autowired
	  private TransactionService transService;

//    TransactionController(TransactionService transService) {
//        this.transService = transService;
//    } 
	
	
	@PostMapping("/")
	public ResponseEntity<TransactionDto> createTransaction(@RequestBody TransactionDto transactionDto)
	{
		TransactionDto transactionDtos= this.transService.createTransaction(transactionDto);
		
		return new ResponseEntity<>(transactionDtos,HttpStatus.CREATED);
	}
	
	@PutMapping("/{transDtoId}")
	public ResponseEntity<TransactionDto> updateTransaction(@RequestBody TransactionDto transDto,@PathVariable Integer transDtoId)
	{     
		TransactionDto updatedtransDto=this.transService.updateTransaction(transDto, transDtoId);
		return ResponseEntity.ok(updatedtransDto);
	}
	
	@DeleteMapping("/{transDtoId}")
	public ResponseEntity<ApiResponse> deleteTransaction(@PathVariable Integer transDtoId){
		this.transService.deleteTransaction(transDtoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse ("Transaction deleted Successfully",true), HttpStatus.OK);
	} 
	
	
	@GetMapping("/")
	public ResponseEntity<List<TransactionDto>> getallTransactions(){
		return ResponseEntity.ok(this.transService.getTransactions());
	}
	
	@GetMapping("/{transDtoId}")
	public ResponseEntity<TransactionDto> getTransById(@PathVariable Integer transDtoId){
		
		return ResponseEntity.ok(this.transService.getTransactionById(transDtoId));
	}
	
}
