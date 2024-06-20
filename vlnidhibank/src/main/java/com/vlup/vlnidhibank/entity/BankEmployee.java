package com.vlup.vlnidhibank.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "addBankEmp")
public class BankEmployee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(nullable = false, length = 20)
	private String branchName;
	
	@Column(nullable = false, length = 100)
	private String empName;
	
	@Column(nullable = false, length = 10)
	private String empCode;
	
	@Column(nullable = false)
	private Date doj;
	
	@Column(nullable = false, length = 10)
	private String mobileNo;
	
	@Column(nullable = false, length = 3)
	private int age;
	
	@Column(nullable = false, length = 50)
	private String address;
	
	@Column(nullable = false, length = 100)
	private String qualification;
	
	@Column(length = 100)
	private int experience;
	
	@Column(nullable = false)
	private Double salary;
	
	@Column(nullable = false, length = 11)
	private Long sbAccNo;
	
	@Column(name = "pan_no", length = 10)
	private String panNo;
	
	@Column(nullable = false, length = 20)
	private String relativeName;
	
	private enum relRelation{Father, Mother, Son, Daughter, Spouse, Husband, Wife, Brother, Sister, DaughterinLaw, BrotherinLaw, GrandDaughter, GrandSon, Other };
	
	@Column(nullable = false)
    private Double fees;
	
	private enum paymentBy{Cash, Cheque, Online, NEFT};
	
	@Column(nullable = false)
	private String remarks;

	private enum empStatus{Yes, No};
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "id")
//    private Nominee nominee;
	
}
