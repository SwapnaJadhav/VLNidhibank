package com.vlup.vlnidhibank.controller;

import com.BankingApp.entities.MISPayment;
import com.BankingApp.services.MISPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mis-payments")
public class MISPaymentController {

    private final MISPaymentService misPaymentService;

    @Autowired
    public MISPaymentController(MISPaymentService misPaymentService) {
        this.misPaymentService = misPaymentService;
    }

    @GetMapping //http://localhost:9090/api/mis-payments
    public List<MISPayment> getAllMISPayments() {
        return misPaymentService.getAllMISPayments();
    }

    @GetMapping("/{id}") //http://localhost:9090/api/mis-payments/{id}
    public ResponseEntity<MISPayment> getMISPaymentById(@PathVariable("id") Long id) {
        Optional<MISPayment> misPayment = misPaymentService.getMISPaymentById(id);
        return misPayment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping //http://localhost:9090/api/mis-payments
    public ResponseEntity<MISPayment> createMISPayment(@RequestBody MISPayment misPayment) {
        MISPayment createdMISPayment = misPaymentService.createMISPayment(misPayment);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMISPayment);
    }

    @PutMapping("/{id}") //http://localhost:9090/api/mis-payments/{id}
    public ResponseEntity<MISPayment> updateMISPayment(
            @PathVariable("id") Long id,
            @RequestBody MISPayment misPayment
    ) {
        MISPayment updatedMISPayment = misPaymentService.updateMISPayment(id, misPayment);
        return ResponseEntity.ok(updatedMISPayment);
    }

    @DeleteMapping("/{id}")//http://localhost:9090/api/mis-payments/{id}
    public ResponseEntity<Void> deleteMISPayment(@PathVariable("id") Long id) {
        misPaymentService.deleteMISPayment(id);
        return ResponseEntity.noContent().build();
    }
}
