package com.vlup.vlnidhibank.service;

import com.BankingApp.entities.JournalVoucher;

import java.util.List;
import java.util.Optional;

public interface JournalVoucherService {
    List<JournalVoucher> getAllJournalVouchers();
    Optional<JournalVoucher> getJournalVoucherById(Long id);
    JournalVoucher createJournalVoucher(JournalVoucher journalVoucher);
    Optional<JournalVoucher> updateJournalVoucher(Long id, JournalVoucher journalVoucher);
    boolean deleteJournalVoucher(Long id);
}
