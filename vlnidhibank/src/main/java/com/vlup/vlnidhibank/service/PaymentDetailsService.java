package com.vlup.vlnidhibank.service;

import com.BankingApp.entities.PaymentDetails;

import java.util.List;

public interface PaymentDetailsService {

    PaymentDetails createPaymentDetails(PaymentDetails paymentDetails);

    PaymentDetails updatePaymentDetails(PaymentDetails paymentDetails);

    void deletePaymentDetails(Integer paymentDetailsId);

    PaymentDetails getPaymentDetailsById(Integer paymentDetailsId);

    List<PaymentDetails> getAllPaymentDetails();
}
