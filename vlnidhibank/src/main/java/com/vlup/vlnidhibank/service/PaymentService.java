package com.vlup.vlnidhibank.service;

import java.util.List;

import com.BankingApp.entities.Payment;

public interface PaymentService {
    Payment createPayment(Payment payment);
    Payment getPayment(Long receiptNo);
    List<Payment> getAllPayments();
    Payment updatePayment(Long receiptNo, Payment payment);
    void deletePayment(Long receiptNo);
}
