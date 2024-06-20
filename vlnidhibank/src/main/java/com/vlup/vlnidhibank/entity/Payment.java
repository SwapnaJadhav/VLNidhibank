package com.vlup.vlnidhibank.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

//import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_no")
    private Long receiptNo;

    @Column(name = "branch", nullable = false)
    private String branch;

    @Column(name = "txn_date", nullable = false)
    private LocalDate txnDate;

    @Column(name = "ledger", nullable = false)
    private String ledger;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "transaction_mode", nullable = false)
    private String transactionMode;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "narration")
    private String narration;

    // Constructor
    public Payment(String branch, LocalDate txnDate, String ledger, String type, String transactionMode, Double amount, String narration) {
        this.branch = branch;
        this.txnDate = txnDate;
        this.ledger = ledger;
        this.type = type;
        this.transactionMode = transactionMode;
        this.amount = amount;
        this.narration = narration;
    }
}
