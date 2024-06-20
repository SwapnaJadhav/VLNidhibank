package com.vlup.vlnidhibank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "journal_voucher")
public class JournalVoucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_no")
    private Long receiptNo;

    @Column(name = "branch", nullable = false)
    private String branch;

    @Column(name = "txn_date", nullable = false)
    private LocalDate txnDate;

    @Column(name = "credit_ledger", nullable = false)
    private String creditLedger;

    @Column(name = "debit_ledger", nullable = false)
    private String debitLedger;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "remarks")
    private String remarks;

    // Constructor
    public JournalVoucher(String branch, LocalDate txnDate, String creditLedger, String debitLedger, Double amount, String remarks) {
        this.branch = branch;
        this.txnDate = txnDate;
        this.creditLedger = creditLedger;
        this.debitLedger = debitLedger;
        this.amount = amount;
        this.remarks = remarks;
    }
}
