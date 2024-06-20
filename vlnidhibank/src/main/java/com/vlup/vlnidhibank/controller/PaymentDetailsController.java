package com.vlup.vlnidhibank.controller;

import com.BankingApp.entities.PaymentDetails;
import com.BankingApp.services.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-details")
public class PaymentDetailsController {

    @Autowired
    private PaymentDetailsService paymentDetailsService;

    @PostMapping
    public ResponseEntity<PaymentDetails> createPaymentDetails(@RequestBody PaymentDetails paymentDetails) {
        PaymentDetails createdPaymentDetails = paymentDetailsService.createPaymentDetails(paymentDetails);
        return new ResponseEntity<>(createdPaymentDetails, HttpStatus.CREATED);
    }

    @PutMapping("/{paymentDetailsId}")
    public ResponseEntity<PaymentDetails> updatePaymentDetails(@PathVariable Integer paymentDetailsId, @RequestBody PaymentDetails paymentDetails) {
        paymentDetails.setId(paymentDetailsId);
        PaymentDetails updatedPaymentDetails = paymentDetailsService.updatePaymentDetails(paymentDetails);
        return new ResponseEntity<>(updatedPaymentDetails, HttpStatus.OK);
    }

    @GetMapping("/{paymentDetailsId}")
    public ResponseEntity<PaymentDetails> getPaymentDetailsById(@PathVariable Integer paymentDetailsId) {
        PaymentDetails paymentDetails = paymentDetailsService.getPaymentDetailsById(paymentDetailsId);
        return ResponseEntity.ok(paymentDetails);
    }

    @GetMapping
    public ResponseEntity<List<PaymentDetails>> getAllPaymentDetails() {
        List<PaymentDetails> paymentDetailsList = paymentDetailsService.getAllPaymentDetails();
        return ResponseEntity.ok(paymentDetailsList);
    }

    @DeleteMapping("/{paymentDetailsId}")
    public ResponseEntity<Void> deletePaymentDetails(@PathVariable Integer paymentDetailsId) {
        paymentDetailsService.deletePaymentDetails(paymentDetailsId);
        return ResponseEntity.noContent().build();
    }
}
