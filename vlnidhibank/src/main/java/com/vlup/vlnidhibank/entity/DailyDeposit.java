package com.vlup.vlnidhibank.entity;

import com.BankingApp.enums.CompoundIntervalEnum;
import com.BankingApp.enums.IsFlexiEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DailyDeposit {
 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    @Column(nullable = false)
	    private String planName;

	    @Column(nullable = false)
	    private Double minimumAmount;

	    @Column(nullable = false)
	    private Double interestRate;

	    @Column(nullable = false)
	    private String termMode;

	    @Column(nullable = false)
	    private Integer term;

	    @Column(nullable = false)
	    private Double commNew;

	    @Column(nullable = false)
	    private Double commRenew;

	    @Enumerated(EnumType.STRING)
	    @Column(nullable = false)
	    private CompoundIntervalEnum compoundInterval;

	    @Column(nullable = false)
	    private Double totalDeposit;

	    @Column(nullable = false)
	    private Double maturityAmount;

	    @Enumerated(EnumType.STRING)
	    @Column(nullable = false)
	    private IsFlexiEnum isFlexi;

	    @Column(nullable = false)
	    private Integer gracePeriod;

	    @Column(nullable = false)
	    private Double lateFine;

	    @Column(nullable = false)
	    private String planStatus;

}
