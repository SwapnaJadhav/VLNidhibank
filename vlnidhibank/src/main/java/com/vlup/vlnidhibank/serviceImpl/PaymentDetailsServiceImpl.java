package com.vlup.vlnidhibank.serviceImpl;

import com.BankingApp.entities.PaymentDetails;
import com.BankingApp.exceptions.ResourceNotFoundException;
import com.BankingApp.repositories.PaymentDetailsRepository;
import com.BankingApp.services.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

    @Autowired
    private PaymentDetailsRepository paymentDetailsRepository;

    @Override
    public PaymentDetails createPaymentDetails(PaymentDetails paymentDetails) {
        return paymentDetailsRepository.save(paymentDetails);
    }

    @Override
    public PaymentDetails updatePaymentDetails(PaymentDetails paymentDetails) {
        // Check if payment details exists
        getPaymentDetailsById(paymentDetails.getId());
        return paymentDetailsRepository.save(paymentDetails);
    }

    @Override
    public void deletePaymentDetails(Integer paymentDetailsId) {
        paymentDetailsRepository.deleteById(paymentDetailsId);
    }

    @Override
    public PaymentDetails getPaymentDetailsById(Integer paymentDetailsId) {
        return paymentDetailsRepository.findById(paymentDetailsId)
                .orElseThrow(() -> new ResourceNotFoundException("PaymentDetails", "id", paymentDetailsId));
    }

    @Override
    public List<PaymentDetails> getAllPaymentDetails() {
        return paymentDetailsRepository.findAll();
    }
}
