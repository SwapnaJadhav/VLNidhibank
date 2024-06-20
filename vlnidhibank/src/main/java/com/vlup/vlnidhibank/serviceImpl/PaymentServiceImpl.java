package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.entities.Payment;
import com.BankingApp.repositories.PaymentRepository;
import com.BankingApp.services.PaymentService;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

	@Override
	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
	}

    @Override
    public Payment getPayment(Long receiptNo) {
    	
        Optional<Payment> payment = paymentRepository.findById(receiptNo);
        return payment.orElse(null); 
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment updatePayment(Long receiptNo, Payment payment) {
        if (paymentRepository.existsById(receiptNo)) {
            payment.setReceiptNo(receiptNo);
            return paymentRepository.save(payment);
        }
        return null; 
    }

    @Override
    public void deletePayment(Long receiptNo) {
        if (paymentRepository.existsById(receiptNo)) {
            paymentRepository.deleteById(receiptNo);
        }
    }

}
