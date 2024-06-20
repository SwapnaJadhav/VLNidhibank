package com.vlup.vlnidhibank.dto;

import java.sql.Date;

import com.vlup.vlnidhibank.entity.ShareDetail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BranchDto {
    private String branchCode;
    private String branchName;
    private Date openingDate;
    private String branchAddress;
    private int pin;
    private String branchState;
    private String branchCity;
    private String contactPersonName;
    private int contactNo;
    private String cspCode;
    private ShareDetail shareDetail;
	public ShareDetail getShareDetail() {
		return shareDetail;
	}
	public void setShareDetail(ShareDetail shareDetail) {
		this.shareDetail = shareDetail;
	}
	public String getCspCode() {
		return cspCode;
	}
	public void setCspCode(String cspCode) {
		this.cspCode = cspCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getBranchState() {
		return branchState;
	}
	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}
		
	public String getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public BranchDto(String branchCode, String branchName, Date openingDate, String branchAddress, int pin,
			String branchState, String branchCity, String contactPersonName, int contactNo, String cspCode,
			ShareDetail shareDetail) {
		super();
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.openingDate = openingDate;
		this.branchAddress = branchAddress;
		this.pin = pin;
		this.branchState = branchState;
		this.branchCity = branchCity;
		this.contactPersonName = contactPersonName;
		this.contactNo = contactNo;
		this.cspCode = cspCode;
		this.shareDetail = shareDetail;
	}
	public BranchDto() {
		super();
	}
	
	
	
	

    
}
