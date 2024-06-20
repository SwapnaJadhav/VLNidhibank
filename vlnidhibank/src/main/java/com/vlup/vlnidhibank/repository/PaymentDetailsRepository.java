package com.vlup.vlnidhibank.repository;

import com.BankingApp.entities.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Integer> {
    
}


