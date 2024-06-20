package com.vlup.vlnidhibank.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class AccountDto {
    private int accId;
	
	private Date date;
	
	private String accountNo;
	
	private String ifscCode;
	
	private String accHolderName;
	
	private enum accType{Saving, Current, Joint};
	
	private Double openingBalance;
	
	private enum status{Active, Closed, Frozen, Inactive};

}
