package com.vlup.vlnidhibank.repository;


import com.BankingApp.entities.MISPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MISPaymentRepository extends JpaRepository<MISPayment, Long> {
}
