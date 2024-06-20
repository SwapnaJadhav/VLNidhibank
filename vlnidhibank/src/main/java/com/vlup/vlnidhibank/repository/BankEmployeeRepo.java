package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.employeeSection.entities.BankEmployee;

public interface BankEmployeeRepo extends JpaRepository<BankEmployee, Integer> {
	

}
