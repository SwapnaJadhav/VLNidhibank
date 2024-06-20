package com.vlup.vlnidhibank.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bank_Branch")
public class Branch {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branch_id;

    @Column(length = 20, nullable = false)
    private String branchCode;

    @Column(length = 30, nullable = false)
    private String branchName;

    @Column(nullable = false)
    private Date openingDate;

    @Column(length = 255, nullable = false)
    private String branchAddress;

    @Column(nullable = false)
    private int pin;

    @Column(length = 30, nullable = false)
    private String branchState;
    
    @Column(length = 30, nullable = false)
    private String branchCity;

    @Column(length = 70, nullable = false)
    private String contactPersonName;

    @Column(nullable = false)
    private int contactNo;
    
    @Column(nullable = false)
    private String cspCode;
    
    @OneToOne(mappedBy="branch")
    private MemberEntity member;
    
    public MemberEntity getMember() {
		return member;
	}

	public void setMember(MemberEntity member) {
		this.member = member;
	}

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "share_detail_id",referencedColumnName = "shareId")
    private ShareDetail shareDetail;
    
	public ShareDetail getShareDetail() {
		return shareDetail;
	}

	public void setShareDetail(ShareDetail shareDetail) {
		this.shareDetail = shareDetail;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public String getCspCode() {
		return cspCode;
	}

	public void setCspCode(String cspCode) {
		this.cspCode = cspCode;
	}

	public Integer getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
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
	
	public String getCity() {
		return branchCity;
	}

	public void setCity(String branchCity) {
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

	public Branch(Integer branch_id, String branchCode, String branchName, Date openingDate, String branchAddress,
			int pin, String branchState, String branchCity, String contactPersonName, int contactNo, String cspCode,
			MemberEntity member, ShareDetail shareDetail) {
		super();
		this.branch_id = branch_id;
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
		this.member = member;
		this.shareDetail = shareDetail;
	}

	public Branch() {
		super();
	}
    
}
