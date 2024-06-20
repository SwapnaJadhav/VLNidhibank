package com.vlup.vlnidhibank.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contra_voucher")
public class ContraVoucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voucher_id")
    private Long voucherId;

    // Assuming branch is a separate entity or identifier
    // @ManyToOne
    // @JoinColumn(name = "branch_id", nullable = false)
    // private Branch branch;

    @Column(name = "txn_date", nullable = false)
    private LocalDate txnDate;

    @Column(name = "cr_ledger", nullable = false)
    private String crLedger;

    @Column(name = "dr_ledger", nullable = false)
    private String drLedger;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "remarks")
    private String remarks;

    // Constructor
    public ContraVoucher(LocalDate txnDate, String crLedger, String drLedger, Double amount, String remarks) {
        this.txnDate = txnDate;
        this.crLedger = crLedger;
        this.drLedger = drLedger;
        this.amount = amount;
        this.remarks = remarks;
    }

  
}
