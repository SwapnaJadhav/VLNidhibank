package com.vlup.vlnidhibank.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BankDto {
	private int bank_id;
    private String bankName;
//    private String accountNo;
//    private String ifscCode;
    private String mobileNo;
    private String address;
    private String city;
    private String country;
    private Date openingdate;
    private Double balance;
//    private BranchDto branch;

}
