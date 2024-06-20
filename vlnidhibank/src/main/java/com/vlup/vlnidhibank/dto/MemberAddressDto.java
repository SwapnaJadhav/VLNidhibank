package com.vlup.vlnidhibank.dto;

import java.lang.reflect.Member;

import com.vlup.vlnidhibank.entity.MemberEntity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberAddressDto {

	
	    private Integer id;
	    private String address;
	    private String district;
	    private String state;
	    private int pincode;  
	    private String rationNo;
	    private MemberEntity memEntity;
	    
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
		public MemberEntity getMemEntity() {
			return memEntity;
		}
		public void setMemEntity(MemberEntity memEntity) {
			this.memEntity = memEntity;
		}
		public MemberAddressDto(Integer id, String address, String district, String state, int pincode, String rationNo,
				MemberEntity memEntity) {
			super();
			this.id = id;
			this.address = address;
			this.district = district;
			this.state = state;
			this.pincode = pincode;
			this.rationNo = rationNo;
			this.memEntity = memEntity;
		}
		public MemberAddressDto() {
			super();
		}
		
		
	    
	      
}
