package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.employeeSection.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}