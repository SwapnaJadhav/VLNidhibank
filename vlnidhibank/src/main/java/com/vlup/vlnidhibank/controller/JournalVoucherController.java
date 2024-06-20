package com.vlup.vlnidhibank.controller;

import com.BankingApp.entities.JournalVoucher;
import com.BankingApp.services.JournalVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/journal-vouchers")
public class JournalVoucherController {

    private final JournalVoucherService journalVoucherService;

    @Autowired
    public JournalVoucherController(JournalVoucherService journalVoucherService) {
        this.journalVoucherService = journalVoucherService;
    }

    @GetMapping //http://localhost:9090/api/journal-vouchers
    public ResponseEntity<List<JournalVoucher>> getAllJournalVouchers() {
        List<JournalVoucher> journalVouchers = journalVoucherService.getAllJournalVouchers();
        return ResponseEntity.ok(journalVouchers);
    }

    @GetMapping("/{id}") //http://localhost:9090/api/journal-vouchers/{id}
    public ResponseEntity<JournalVoucher> getJournalVoucherById(@PathVariable("id") Long id) {
        Optional<JournalVoucher> journalVoucher = journalVoucherService.getJournalVoucherById(id);
        return journalVoucher.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping //http://localhost:9090/api/journal-vouchers
    public ResponseEntity<JournalVoucher> createJournalVoucher(@RequestBody JournalVoucher journalVoucher) {
        JournalVoucher createdJournalVoucher = journalVoucherService.createJournalVoucher(journalVoucher);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdJournalVoucher);
    }

    @PutMapping("/{id}") //http://localhost:9090/api/journal-vouchers/{id}
    public ResponseEntity<JournalVoucher> updateJournalVoucher(
            @PathVariable("id") Long id,
            @RequestBody JournalVoucher journalVoucher
    ) {
        Optional<JournalVoucher> updatedJournalVoucher = journalVoucherService.updateJournalVoucher(id, journalVoucher);
        return updatedJournalVoucher.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}") //http://localhost:9090/api/journal-vouchers/{id}
    public ResponseEntity<Void> deleteJournalVoucher(@PathVariable("id") Long id) {
        if (journalVoucherService.deleteJournalVoucher(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
