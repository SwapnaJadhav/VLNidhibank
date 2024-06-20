package com.vlup.vlnidhibank.dto;

public class PaymentDetailsDTO {

    private Integer id;
    private Double fees;
    private String paymentBy;
    private String remarks;
    private String advisorStatus;
    private Boolean smsSend;


    public PaymentDetailsDTO() {
    }

    public PaymentDetailsDTO(Double fees, String paymentBy, String remarks, String advisorStatus, Boolean smsSend) {
        this.fees = fees;
        this.paymentBy = paymentBy;
        this.remarks = remarks;
        this.advisorStatus = advisorStatus;
        this.smsSend = smsSend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public String getPaymentBy() {
        return paymentBy;
    }

    public void setPaymentBy(String paymentBy) {
        this.paymentBy = paymentBy;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAdvisorStatus() {
        return advisorStatus;
    }

    public void setAdvisorStatus(String advisorStatus) {
        this.advisorStatus = advisorStatus;
    }

    public Boolean getSmsSend() {
        return smsSend;
    }

    public void setSmsSend(Boolean smsSend) {
        this.smsSend = smsSend;
    }
}
