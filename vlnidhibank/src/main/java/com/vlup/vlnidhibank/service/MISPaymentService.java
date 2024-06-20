package com.vlup.vlnidhibank.service;

import com.BankingApp.entities.MISPayment;

import java.util.List;
import java.util.Optional;

public interface MISPaymentService {
    List<MISPayment> getAllMISPayments();
    Optional<MISPayment> getMISPaymentById(Long id);
    MISPayment createMISPayment(MISPayment misPayment);
    MISPayment updateMISPayment(Long id, MISPayment misPayment);
    void deleteMISPayment(Long id);
}
