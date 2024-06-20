package com.vlup.vlnidhibank.dto;

import java.time.LocalDate;

public class JournalVoucherDTO {

    private String branch;
    private LocalDate txnDate;
    private String creditLedger;
    private String debitLedger;
    private Double amount;
    private String remarks;

    // Constructors, getters, and setters
    public JournalVoucherDTO() {
    }

    public JournalVoucherDTO(String branch, LocalDate txnDate, String creditLedger, String debitLedger, Double amount, String remarks) {
        this.branch = branch;
        this.txnDate = txnDate;
        this.creditLedger = creditLedger;
        this.debitLedger = debitLedger;
        this.amount = amount;
        this.remarks = remarks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public LocalDate getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(LocalDate txnDate) {
        this.txnDate = txnDate;
    }

    public String getCreditLedger() {
        return creditLedger;
    }

    public void setCreditLedger(String creditLedger) {
        this.creditLedger = creditLedger;
    }

    public String getDebitLedger() {
        return debitLedger;
    }

    public void setDebitLedger(String debitLedger) {
        this.debitLedger = debitLedger;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
