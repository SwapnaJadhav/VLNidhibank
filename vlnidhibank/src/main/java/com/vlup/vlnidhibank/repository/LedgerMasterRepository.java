package com.vlup.vlnidhibank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankingApp.entities.LedgerMaster;

@Repository
public interface LedgerMasterRepository extends JpaRepository<LedgerMaster, Long> {
   
}
