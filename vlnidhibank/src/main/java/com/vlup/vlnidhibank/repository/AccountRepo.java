package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.employeeSection.entities.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{

}
