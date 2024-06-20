package com.vlup.vlnidhibank.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import com.vlup.vlnidhibank.enums.TransactionStatus;
import com.vlup.vlnidhibank.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private BigDecimal amount;

	@Column(nullable = false)
	private LocalDateTime transactionDate;

	@Column(name = "type", nullable = false, length = 50)
	    @Enumerated(EnumType.STRING)
	    private TransactionType type;

	@Column(name = "status", nullable = false, length = 50)
	    @Enumerated(EnumType.STRING)
	    private TransactionStatus status;

	@Column(name = "description",length=500)
	    private String description;

	@Column(nullable = false)
	private Long sourceAccountId;

	@Column(nullable = false)
	private Long destinationAccountId;

	@Column(nullable = false)
	private String currency;

	@Column(nullable = false)
	private LocalDateTime createdAt;

	@Column(nullable = false)
	private LocalDateTime updatedAt;
	
	@Column(name = "location", length = 100)
	    private String location;

    @Column(name = "transaction_fee", precision = 10, scale = 2)
	    private BigDecimal transactionFee;
	
	@Column(name = "payment_method", length = 50)
	    private String paymentMethod;

	@Column(name = "transaction_reference", length = 100)
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

	public Transaction(Integer id, BigDecimal amount, LocalDateTime transactionDate, TransactionType type,
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

	public Transaction() {
		super();
	}

//	 @ManyToOne
//	    @JoinColumn(name = "user_id")
//	    private User user;

//	    @ManyToOne
//	    @JoinColumn(name = "account_id")
//	    private Account account;

//	@ManyToOne
//	    @JoinColumn(name = "merchant_id")
//	    private Merchant merchant;

//    @ManyToOne
//    @JoinColumn(name = "memberCode", nullable = false)
//  private Member member;

	
	
}
