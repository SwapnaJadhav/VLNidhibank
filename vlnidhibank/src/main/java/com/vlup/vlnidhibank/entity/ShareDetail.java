package com.vlup.vlnidhibank.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.List;

import com.vlup.vlnidhibank.enums.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "ShareDetails")
public class ShareDetail {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shareId;


    
    
    private int advisiorId;
    private int installmentNo;

    @Column(length = 50)
    private String shareAllotedFrom;

    private int previousShareBalance;
    private int previousNoOfShare;

    @Column(length = 100)
    private String folioNo;

    @Column(length = 100)
    private String dno;

    private BigDecimal unallotedShare;
    private Date transferDate;
    private BigDecimal transferAmount;

    @Column(length = 20, unique = true, nullable = false)
    private String shareNumber;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal shareValue;

    @Column(nullable = false)
    private int totalShares;

    @Column(nullable = false)
    private Date issueDate;
    
    private BigDecimal fees;

    private Date maturityDate;

    @Column(length = 20)
    private String paymentBy;

    @Column(precision = 10, scale = 2, columnDefinition = "decimal(10, 2) default '0.00'")
    private BigDecimal dividendsEarned;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updatedAt;

    @Lob
    private String remarks;
    
    @Enumerated(EnumType.STRING)
    private Status status;    
    
    @OneToMany(mappedBy = "shareDetail")
    private List<Branch> branches;

	public int getShareId() {
		return shareId;
	}


	public BigDecimal getFees() {
		return fees;
	}


	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}


	public List<Branch> getBranches() {
		return branches;
	}


	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}


	public void setShareId(int shareId) {
		this.shareId = shareId;
	}


	public int getAdvisiorId() {
		return advisiorId;
	}

	public void setAdvisiorId(int advisiorId) {
		this.advisiorId = advisiorId;
	}

	public int getInstallmentNo() {
		return installmentNo;
	}



	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}






	public String getShareAllotedFrom() {
		return shareAllotedFrom;
	}






	public void setShareAllotedFrom(String shareAllotedFrom) {
		this.shareAllotedFrom = shareAllotedFrom;
	}






	public int getPreviousShareBalance() {
		return previousShareBalance;
	}






	public void setPreviousShareBalance(int previousShareBalance) {
		this.previousShareBalance = previousShareBalance;
	}






	public int getPreviousNoOfShare() {
		return previousNoOfShare;
	}






	public void setPreviousNoOfShare(int previousNoOfShare) {
		this.previousNoOfShare = previousNoOfShare;
	}






	public String getFolioNo() {
		return folioNo;
	}






	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}






	public String getDno() {
		return dno;
	}






	public void setDno(String dno) {
		this.dno = dno;
	}






	public BigDecimal getUnallotedShare() {
		return unallotedShare;
	}






	public void setUnallotedShare(BigDecimal unallotedShare) {
		this.unallotedShare = unallotedShare;
	}






	public Date getTransferDate() {
		return transferDate;
	}






	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}






	public BigDecimal getTransferAmount() {
		return transferAmount;
	}






	public void setTransferAmount(BigDecimal transferAmount) {
		this.transferAmount = transferAmount;
	}






	public String getShareNumber() {
		return shareNumber;
	}






	public void setShareNumber(String shareNumber) {
		this.shareNumber = shareNumber;
	}






	public BigDecimal getShareValue() {
		return shareValue;
	}






	public void setShareValue(BigDecimal shareValue) {
		this.shareValue = shareValue;
	}






	public int getTotalShares() {
		return totalShares;
	}






	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}






	public Date getIssueDate() {
		return issueDate;
	}






	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}






	public Date getMaturityDate() {
		return maturityDate;
	}






	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}






	public String getPaymentBy() {
		return paymentBy;
	}






	public void setPaymentBy(String paymentBy) {
		this.paymentBy = paymentBy;
	}






	public BigDecimal getDividendsEarned() {
		return dividendsEarned;
	}






	public void setDividendsEarned(BigDecimal dividendsEarned) {
		this.dividendsEarned = dividendsEarned;
	}






	public Date getCreatedAt() {
		return createdAt;
	}






	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}






	public Date getUpdatedAt() {
		return updatedAt;
	}






	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}






	public String getRemarks() {
		return remarks;
	}






	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}






	public Status getStatus() {
		return status;
	}




	public void setStatus(Status status) {
		this.status = status;
	}


	public ShareDetail(int shareId, int advisiorId, int installmentNo, String shareAllotedFrom,
			int previousShareBalance, int previousNoOfShare, String folioNo, String dno, BigDecimal unallotedShare,
			Date transferDate, BigDecimal transferAmount, String shareNumber, BigDecimal shareValue, int totalShares,
			Date issueDate, BigDecimal fees, Date maturityDate, String paymentBy, BigDecimal dividendsEarned,
			Date createdAt, Date updatedAt, String remarks, Status status, List<Branch> branches) {
		super();
		this.shareId = shareId;
		this.advisiorId = advisiorId;
		this.installmentNo = installmentNo;
		this.shareAllotedFrom = shareAllotedFrom;
		this.previousShareBalance = previousShareBalance;
		this.previousNoOfShare = previousNoOfShare;
		this.folioNo = folioNo;
		this.dno = dno;
		this.unallotedShare = unallotedShare;
		this.transferDate = transferDate;
		this.transferAmount = transferAmount;
		this.shareNumber = shareNumber;
		this.shareValue = shareValue;
		this.totalShares = totalShares;
		this.issueDate = issueDate;
		this.fees = fees;
		this.maturityDate = maturityDate;
		this.paymentBy = paymentBy;
		this.dividendsEarned = dividendsEarned;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.remarks = remarks;
		this.status = status;
		this.branches = branches;
	}


	public ShareDetail() {
		super();
	}
    
    
  

     	
    

}
