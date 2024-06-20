package com.vlup.vlnidhibank.entity;



import java.sql.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BankDetails")
public class Bank {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bank_id;
	
	@Column(nullable = false, length = 100)
	private String bankName;
	
//	@Column(nullable = false, length = 11)
//	private String accountNo;
	
//	@Column(nullable = false,length = 20)
//	private String ifscCode;
	
	
	@Column(nullable = false, length = 10)
	private String mobileNo;
	
	@Column(nullable = false, length = 100)
	private String address;
	
	 @Column(name = "city")
	 private String city;

	 @Column(name = "country")
	 private String country;
	
	@Column(nullable = false)
	private Date openingdate;
	
	@Column(nullable = false)
	private Double balance;  //modify

	
//	@OneToMany(cascade = CascadeType.ALL)
//	@ManyToOne    // Many banks can belong to one branch
//	@JoinColumn(name = "branchName")
//	private Branch branch;
	
	//@OneToMany   // one bank have many branches
//    @JoinColumn(referencedColumnName = "branch_id")
//	private Branch branch;
	

}
