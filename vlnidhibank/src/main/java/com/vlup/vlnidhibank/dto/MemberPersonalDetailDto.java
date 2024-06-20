package com.vlup.vlnidhibank.dto;

import java.lang.reflect.Member;
import java.sql.Date;

import com.vlup.vlnidhibank.entity.MemberEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MemberPersonalDetailDto {
	
	    private int id;
	    private int membersId;
	    private String code;
	    private String memberName;
	    private Date registrationDate;
	    private String gender;
	    private Date dob;
	    private Long age;
	    private String maritalStatus;
	    private Long aadharNo;
	    private String panNo;
	    private String voterId;
	    private String drivingLiscNo;
	    private String mobileNo;
	    private String emailId;
	    private String occupation;
	    private String education;
	    private MemberEntity memEntity;
	    
	    
		public MemberEntity getMemEntity() {
			return memEntity;
		}
		public void setMemEntity(MemberEntity memEntity) {
			this.memEntity = memEntity;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getMembersId() {
			return membersId;
		}
		public void setMembersId(int membersId) {
			this.membersId = membersId;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMemberName() {
			return memberName;
		}
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		public Date getRegistrationDate() {
			return registrationDate;
		}
		public void setRegistrationDate(Date registrationDate) {
			this.registrationDate = registrationDate;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public Long getAge() {
			return age;
		}
		public void setAge(Long age) {
			this.age = age;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public Long getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(Long aadharNo) {
			this.aadharNo = aadharNo;
		}
		public String getPanNo() {
			return panNo;
		}
		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}
		public String getVoterId() {
			return voterId;
		}
		public void setVoterId(String voterId) {
			this.voterId = voterId;
		}
		public String getDrivingLiscNo() {
			return drivingLiscNo;
		}
		public void setDrivingLiscNo(String drivingLiscNo) {
			this.drivingLiscNo = drivingLiscNo;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public MemberPersonalDetailDto(int id, int membersId, String code, String memberName, Date registrationDate,
				String gender, Date dob, Long age, String maritalStatus, Long aadharNo, String panNo, String voterId,
				String drivingLiscNo, String mobileNo, String emailId, String occupation, String education,
				MemberEntity memEntity) {
			super();
			this.id = id;
			this.membersId = membersId;
			this.code = code;
			this.memberName = memberName;
			this.registrationDate = registrationDate;
			this.gender = gender;
			this.dob = dob;
			this.age = age;
			this.maritalStatus = maritalStatus;
			this.aadharNo = aadharNo;
			this.panNo = panNo;
			this.voterId = voterId;
			this.drivingLiscNo = drivingLiscNo;
			this.mobileNo = mobileNo;
			this.emailId = emailId;
			this.occupation = occupation;
			this.education = education;
			this.memEntity = memEntity;
		}
		public MemberPersonalDetailDto() {
			super();
		}
		
}



