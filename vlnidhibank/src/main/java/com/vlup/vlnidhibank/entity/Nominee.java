package com.vlup.vlnidhibank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "NomineeDetails")
public class Nominee {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int nominee_id;	    

	        @Column(name = "nomineeName",length = 50, nullable = false)
	        private String nomineeName;
	        
	        @Column(name = "nomineeRelation", length = 10)
		    private String nomineeRelation;
	        
	        @Column(length = 10, nullable = false)
	        private String mobileNo;

	        @Column(nullable = false)
	        private int age;

	        @Column(nullable = false)
	        private int panNo;

	        @Column(length = 200, nullable = false)
	        private String address;

	        @Column(length = 20, nullable = false)
	        private String nomineeKycType;
            
	        @OneToOne(mappedBy="nominee")
	        private MemberEntity member;
	        
			public int getId() {
				return nominee_id;
			}

			public void setId(int id) {
				this.nominee_id = id;
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

			public int getNominee_id() {
				return nominee_id;
			}

			public void setNominee_id(int nominee_id) {
				this.nominee_id = nominee_id;
			}

			public MemberEntity getMember() {
				return member;
			}

			public void setMember(MemberEntity member) {
				this.member = member;
			}

			public Nominee(int nominee_id, String nomineeName, String nomineeRelation, String mobileNo, int age,
					int panNo, String address, String nomineeKycType, MemberEntity member) {
				super();
				this.nominee_id = nominee_id;
				this.nomineeName = nomineeName;
				this.nomineeRelation = nomineeRelation;
				this.mobileNo = mobileNo;
				this.age = age;
				this.panNo = panNo;
				this.address = address;
				this.nomineeKycType = nomineeKycType;
				this.member = member;
			}

			public Nominee() {
				super();
			}
           			      
	  }

	    

