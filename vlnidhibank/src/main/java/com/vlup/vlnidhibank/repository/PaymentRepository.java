package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingApp.entities.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
}

