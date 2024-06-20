package com.vlup.vlnidhibank.serviceImpl;

import com.BankingApp.entities.JournalVoucher;
import com.BankingApp.repositories.JournalVoucherRepository;
import com.BankingApp.services.JournalVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalVoucherServiceImpl implements JournalVoucherService {

    private final JournalVoucherRepository journalVoucherRepository;

    @Autowired
    public JournalVoucherServiceImpl(JournalVoucherRepository journalVoucherRepository) {
        this.journalVoucherRepository = journalVoucherRepository;
    }

    @Override
    public List<JournalVoucher> getAllJournalVouchers() {
        return journalVoucherRepository.findAll();
    }

    @Override
    public Optional<JournalVoucher> getJournalVoucherById(Long id) {
        return journalVoucherRepository.findById(id);
    }

    @Override
    public JournalVoucher createJournalVoucher(JournalVoucher journalVoucher) {
        return journalVoucherRepository.save(journalVoucher);
    }

    @Override
    public Optional<JournalVoucher> updateJournalVoucher(Long id, JournalVoucher journalVoucher) {
        return journalVoucherRepository.findById(id)
                .map(existingVoucher -> {
                    existingVoucher.setBranch(journalVoucher.getBranch());
                    existingVoucher.setTxnDate(journalVoucher.getTxnDate());
                    existingVoucher.setCreditLedger(journalVoucher.getCreditLedger());
                    existingVoucher.setDebitLedger(journalVoucher.getDebitLedger());
                    existingVoucher.setAmount(journalVoucher.getAmount());
                    existingVoucher.setRemarks(journalVoucher.getRemarks());
                    return journalVoucherRepository.save(existingVoucher);
                });
    }

    @Override
    public boolean deleteJournalVoucher(Long id) {
        if (journalVoucherRepository.existsById(id)) {
            journalVoucherRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
