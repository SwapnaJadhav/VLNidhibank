package com.vlup.vlnidhibank.dto;

import com.BankingApp.enums.CompoundIntervalEnum;
import com.BankingApp.enums.IsFlexiEnum;


public class DailyDepositDTO {


	    private String planName;
	    private Double minimumAmount;
	    private Double interestRate;
	    private String termMode;
	    private Integer term;
	    private Double commNew;
	    private Double commRenew;
	    private CompoundIntervalEnum compoundInterval;
	    private Double totalDeposit;
	    private Double maturityAmount;
	    private IsFlexiEnum isFlexi;
	    private Integer gracePeriod;
	    private Double lateFine;
	    private String planStatus;

	    // Getters and Setters

	    public String getPlanName() {
	        return planName;
	    }

	    public void setPlanName(String planName) {
	        this.planName = planName;
	    }

	    public Double getMinimumAmount() {
	        return minimumAmount;
	    }

	    public void setMinimumAmount(Double minimumAmount) {
	        this.minimumAmount = minimumAmount;
	    }

	    public Double getInterestRate() {
	        return interestRate;
	    }

	    public void setInterestRate(Double interestRate) {
	        this.interestRate = interestRate;
	    }

	    public String getTermMode() {
	        return termMode;
	    }

	    public void setTermMode(String termMode) {
	        this.termMode = termMode;
	    }

	    public Integer getTerm() {
	        return term;
	    }

	    public void setTerm(Integer term) {
	        this.term = term;
	    }

	    public Double getCommNew() {
	        return commNew;
	    }

	    public void setCommNew(Double commNew) {
	        this.commNew = commNew;
	    }

	    public Double getCommRenew() {
	        return commRenew;
	    }

	    public void setCommRenew(Double commRenew) {
	        this.commRenew = commRenew;
	    }

	    public CompoundIntervalEnum getCompoundInterval() {
	        return compoundInterval;
	    }

	    public void setCompoundInterval(CompoundIntervalEnum compoundInterval) {
	        this.compoundInterval = compoundInterval;
	    }

	    public Double getTotalDeposit() {
	        return totalDeposit;
	    }

	    public void setTotalDeposit(Double totalDeposit) {
	        this.totalDeposit = totalDeposit;
	    }

	    public Double getMaturityAmount() {
	        return maturityAmount;
	    }

	    public void setMaturityAmount(Double maturityAmount) {
	        this.maturityAmount = maturityAmount;
	    }

	    public IsFlexiEnum getIsFlexi() {
	        return isFlexi;
	    }

	    public void setIsFlexi(IsFlexiEnum isFlexi) {
	        this.isFlexi = isFlexi;
	    }

	    public Integer getGracePeriod() {
	        return gracePeriod;
	    }

	    public void setGracePeriod(Integer gracePeriod) {
	        this.gracePeriod = gracePeriod;
	    }

	    public Double getLateFine() {
	        return lateFine;
	    }

	    public void setLateFine(Double lateFine) {
	        this.lateFine = lateFine;
	    }

	    public String getPlanStatus() {
	        return planStatus;
	    }

	    public void setPlanStatus(String planStatus) {
	        this.planStatus = planStatus;
	    }
}



