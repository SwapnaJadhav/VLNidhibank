package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.entities.LedgerMaster;
import com.BankingApp.exceptions.ResourceNotFoundException;
import com.BankingApp.repositories.LedgerMasterRepository;
import com.BankingApp.services.LedgerMasterService;

@Service
public class LedgerMasterServiceImpl implements LedgerMasterService {

    @Autowired
    private LedgerMasterRepository ledgerMasterRepository;

    @Override
    public LedgerMaster createLedgerMaster(LedgerMaster ledgerMaster) {
        return ledgerMasterRepository.save(ledgerMaster);
    }

    @Override
    public LedgerMaster getLedgerMasterById(Long id) {
        return ledgerMasterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("LedgerMaster", "id", id));
    }

    @Override
    public List<LedgerMaster> getAllLedgerMasters() {
        return ledgerMasterRepository.findAll();
    }

    @Override
    public LedgerMaster updateLedgerMaster(Long id, LedgerMaster updatedLedgerMaster) {
        LedgerMaster ledgerMaster = ledgerMasterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("LedgerMaster", "id", id));

        ledgerMaster.setLedgerName(updatedLedgerMaster.getLedgerName());
        ledgerMaster.setGroupName(updatedLedgerMaster.getGroupName());

        return ledgerMasterRepository.save(ledgerMaster);
    }

    @Override
    public void deleteLedgerMaster(Long id) {
        LedgerMaster ledgerMaster = ledgerMasterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("LedgerMaster", "id", id));

        ledgerMasterRepository.delete(ledgerMaster);
    }


}
