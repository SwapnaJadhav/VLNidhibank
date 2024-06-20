package com.vlup.vlnidhibank.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShareDetailDto {

    //private Integer memberId;
    private Integer advisiorId;
    private Integer installmentNo;
    private String shareAllotedFrom;
    private Integer previousShareBalance;
    private Integer previousNoOfShare;
    private String folioNo;
    private String dno;
    private BigDecimal unallotedShare;
    private Date transferDate;
    private BigDecimal transferAmount;
    private String shareNumber;
    private BigDecimal shareValue;
    private Integer totalShares;
    private Date issueDate;
    private Date maturityDate;
    private String paymentBy;
    private Status status;
    private BigDecimal dividendsEarned;
    private Date createdAt;
    private Date updatedAt;
    private String remarks;
    private BigDecimal fees;
    private List<Branch> branches;
	
	
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
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getAdvisiorId() {
		return advisiorId;
	}
	public void setAdvisiorId(Integer advisiorId) {
		this.advisiorId = advisiorId;
	}
	public Integer getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(Integer installmentNo) {
		this.installmentNo = installmentNo;
	}
	public String getShareAllotedFrom() {
		return shareAllotedFrom;
	}
	public void setShareAllotedFrom(String shareAllotedFrom) {
		this.shareAllotedFrom = shareAllotedFrom;
	}
	public Integer getPreviousShareBalance() {
		return previousShareBalance;
	}
	public void setPreviousShareBalance(Integer previousShareBalance) {
		this.previousShareBalance = previousShareBalance;
	}
	public Integer getPreviousNoOfShare() {
		return previousNoOfShare;
	}
	public void setPreviousNoOfShare(Integer previousNoOfShare) {
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
	public Integer getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(Integer totalShares) {
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
	
	public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
		// TODO Auto-generated method stub
		return remarks;
	}
	public ShareDetailDto(Integer advisiorId, Integer installmentNo, String shareAllotedFrom,
			Integer previousShareBalance, Integer previousNoOfShare, String folioNo, String dno,
			BigDecimal unallotedShare, Date transferDate, BigDecimal transferAmount, String shareNumber,
			BigDecimal shareValue, Integer totalShares, Date issueDate, Date maturityDate, String paymentBy,
			Status status, BigDecimal dividendsEarned, Date createdAt, Date updatedAt, String remarks, BigDecimal fees,
			List<Branch> branches) {
		super();
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
		this.maturityDate = maturityDate;
		this.paymentBy = paymentBy;
		this.status = status;
		this.dividendsEarned = dividendsEarned;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.remarks = remarks;
		this.fees = fees;
		this.branches = branches;
	}
	public ShareDetailDto() {
		super();
	}
	
     
	
}
