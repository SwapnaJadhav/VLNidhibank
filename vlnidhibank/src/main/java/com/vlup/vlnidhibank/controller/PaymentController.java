package com.vlup.vlnidhibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.BankingApp.entities.Payment;
import com.BankingApp.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @GetMapping("/{receiptNo}")
    public Payment getPayment(@PathVariable Long receiptNo) {
        return paymentService.getPayment(receiptNo);
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PutMapping("/{receiptNo}")
    public Payment updatePayment(@PathVariable Long receiptNo, @RequestBody Payment payment) {
        return paymentService.updatePayment(receiptNo, payment);
    }

    @DeleteMapping("/{receiptNo}")
    public void deletePayment(@PathVariable Long receiptNo) {
        paymentService.deletePayment(receiptNo);
    }
}
