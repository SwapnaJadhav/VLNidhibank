package com.vlup.vlnidhibank.service;

import java.util.List;

import com.BankingApp.entities.LedgerMaster;

public interface LedgerMasterService {

    LedgerMaster createLedgerMaster(LedgerMaster ledgerMaster);

    LedgerMaster getLedgerMasterById(Long id);

    List<LedgerMaster> getAllLedgerMasters();

    LedgerMaster updateLedgerMaster(Long id, LedgerMaster ledgerMaster);

    void deleteLedgerMaster(Long id);
}

