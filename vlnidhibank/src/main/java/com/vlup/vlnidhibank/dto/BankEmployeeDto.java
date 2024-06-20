package com.vlup.vlnidhibank.dto;

import java.sql.Date;

import com.bank.employeeSection.entities.Nominee;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BankEmployeeDto {
	
    private int empId;
	private String branchName;
	private String empName;
	private String empCode;
	private Date doj;
	private String mobileNo;
	private int age;
	private String address;
	private String qualification;
	private int experience;
	private Double salary;
	private Long sbAccNo;
    private String panNo;
	private String relativeName;
	private enum relRelation{Father, Mother, Son, Daughter, Spouse, Husband, Wife, Brother, Sister, DaughterinLaw, BrotherinLaw, GrandDaughter, GrandSon, Other };
    private Double fees;
	private enum paymentBy{Cash, Cheque, Online, NEFT};
	private String remarks;
	private enum empStatus{Yes, No};
	
//	private Nominee nominee;
	

}
