package com.vlup.vlnidhibank.entity;

import java.lang.reflect.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "MemberAddress")
public class MemberAddress {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "district", nullable = false, length = 30)
    private String district;

    @Column(name = "state", nullable = false, length = 30)
    private String state;

    @Column(name = "pincode")
    private int pincode;

    @Column(name = "rationNo", length = 50)
    private String rationNo;
    
    @OneToOne(mappedBy="memberAddress")
    private MemberEntity member;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getRationNo() {
		return rationNo;
	}

	public void setRationNo(String rationNo) {
		this.rationNo = rationNo;
	}

	public MemberEntity getMember() {
		return member;
	}

	public void setMemberEntity(MemberEntity member) {
		this.member = member;
	}

	public MemberAddress(Integer id, String address, String district, String state, int pincode, String rationNo,
			MemberEntity member) {
		super();
		this.id = id;
		this.address = address;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.rationNo = rationNo;
		this.member = member;
	}

	public MemberAddress() {
		super();
	}

	
    
}
