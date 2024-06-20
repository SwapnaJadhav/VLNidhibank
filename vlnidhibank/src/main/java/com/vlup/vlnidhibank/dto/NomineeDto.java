package com.vlup.vlnidhibank.dto;

import com.vlup.vlnidhibank.entity.MemberEntity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NomineeDto 
{
        
        private String nomineeName;
	    private String nomineeRelation;
        private String mobileNo;
        private int age;
        private int panNo;
        private String address;
        private String nomineeKycType;
        private MemberEntity memEntity;
		public MemberEntity getMemEntity() {
			return memEntity;
		}
		public void setMemEntity(MemberEntity memEntity) {
			this.memEntity = memEntity;
		}
		
		public String getNomineeName() {
			return nomineeName;
		}
		public void setNomineeName(String nomineeName) {
			this.nomineeName = nomineeName;
		}
		public String getNomineeRelation() {
			return nomineeRelation;
		}
		public void setNomineeRelation(String nomineeRelation) {
			this.nomineeRelation = nomineeRelation;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getPanNo() {
			return panNo;
		}
		public void setPanNo(int panNo) {
			this.panNo = panNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getNomineeKycType() {
			return nomineeKycType;
		}
		public void setNomineeKycType(String nomineeKycType) {
			this.nomineeKycType = nomineeKycType;
		}
		public NomineeDto(int nominees_id, String nomineeName, String nomineeRelation, String mobileNo, int age,
				int panNo, String address, String nomineeKycType, MemberEntity memEntity) {
			super();
			this.nomineeName = nomineeName;
			this.nomineeRelation = nomineeRelation;
			this.mobileNo = mobileNo;
			this.age = age;
			this.panNo = panNo;
			this.address = address;
			this.nomineeKycType = nomineeKycType;
			this.memEntity = memEntity;
		}
		public NomineeDto() {
			super();
		}
        
        
  }
