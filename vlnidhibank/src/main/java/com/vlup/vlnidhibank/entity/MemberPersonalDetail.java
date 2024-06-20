package com.vlup.vlnidhibank.entity;

import java.lang.reflect.Member;
import java.sql.Date;

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
@Table(name = "MemberPersonalDetails")
public class MemberPersonalDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "members_id")
    private int membersId;

    @Column(name = "code")
    private String code;

    @Column(name = "memberName", nullable = false, length = 50)
    private String memberName;

    @Column(name = "registrationDate", nullable = false)
    private Date registrationDate;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "dob", nullable = false)
    
    private Date dob;

    @Column(name = "age")
    private Long age;

    @Column(name = "marital_status", length = 10)
    private String maritalStatus;

    @Column(name = "aadharNo", nullable = false)
    private Long aadharNo;

    @Column(name = "panNo", length = 20)
    private String panNo;

    @Column(name = "voter_id", nullable = false, length = 20)
    private String voterId;

    @Column(name = "drivingLiscNo", length = 50)
    private String drivingLiscNo;

    @Column(name = "mobileNo", length = 20)
    private String mobileNo;

    @Column(name = "emailId", length = 50)
    private String emailId;

    @Column(name = "occupation", length = 20)
    private String occupation;

    @Column(name = "education", length = 20)
    private String education;
    
    @OneToOne(mappedBy="memPerDetail")
    private MemberEntity member;

	public MemberEntity getMember() {
		return member;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public void setAge(Long long1) {
		this.age = long1;
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

	public void setAadharNo(Long long1) {
		this.aadharNo = long1;
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

	public MemberPersonalDetail(Integer id, int membersId, String code, String memberName, Date registrationDate,
			String gender, Date dob, Long age, String maritalStatus, Long aadharNo, String panNo, String voterId,
			String drivingLiscNo, String mobileNo, String emailId, String occupation, String education,
			MemberEntity member) {
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
		this.member = member;
	}

	public MemberPersonalDetail() {
		super();
	}

	
    
    

}
