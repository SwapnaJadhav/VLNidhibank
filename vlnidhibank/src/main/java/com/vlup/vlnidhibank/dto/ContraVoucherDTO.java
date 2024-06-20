package com.vlup.vlnidhibank.dto;

import java.time.LocalDate;

public class ContraVoucherDTO {

    private Long voucherId;
    // private String branch; // Assuming branch is represented as a string in DTO
    private LocalDate txnDate;
    private String crLedger;
    private String drLedger;
    private Double amount;
    private String remarks;

    // Getters and setters

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public LocalDate getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(LocalDate txnDate) {
        this.txnDate = txnDate;
    }

    public String getCrLedger() {
        return crLedger;
    }

    public void setCrLedger(String crLedger) {
        this.crLedger = crLedger;
    }

    public String getDrLedger() {
        return drLedger;
    }

    public void setDrLedger(String drLedger) {
        this.drLedger = drLedger;
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
