package com.vlup.vlnidhibank.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.vlup.vlnidhibank.enums.TransactionStatus;
import com.vlup.vlnidhibank.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
	private Integer id;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private TransactionType type;
    private TransactionStatus status;
    private String description;
    private Long sourceAccountId;
    private Long destinationAccountId;
    private String currency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String location;
    private BigDecimal transactionFee;
    private String paymentMethod;
    private String transactionReference;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	public TransactionStatus getStatus() {
		return status;
	}
	public void setStatus(TransactionStatus status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSourceAccountId() {
		return sourceAccountId;
	}
	public void setSourceAccountId(Long sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}
	public Long getDestinationAccountId() {
		return destinationAccountId;
	}
	public void setDestinationAccountId(Long destinationAccountId) {
		this.destinationAccountId = destinationAccountId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BigDecimal getTransactionFee() {
		return transactionFee;
	}
	public void setTransactionFee(BigDecimal transactionFee) {
		this.transactionFee = transactionFee;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	public TransactionDto() {
		super();
	}
	public TransactionDto(Integer id, BigDecimal amount, LocalDateTime transactionDate, TransactionType type,
			TransactionStatus status, String description, Long sourceAccountId, Long destinationAccountId,
			String currency, LocalDateTime createdAt, LocalDateTime updatedAt, String location,
			BigDecimal transactionFee, String paymentMethod, String transactionReference) {
		super();
		this.id = id;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.type = type;
		this.status = status;
		this.description = description;
		this.sourceAccountId = sourceAccountId;
		this.destinationAccountId = destinationAccountId;
		this.currency = currency;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.location = location;
		this.transactionFee = transactionFee;
		this.paymentMethod = paymentMethod;
		this.transactionReference = transactionReference;
	}
    
    

    
    
}
