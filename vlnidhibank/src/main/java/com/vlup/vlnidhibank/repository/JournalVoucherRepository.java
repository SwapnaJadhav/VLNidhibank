package com.vlup.vlnidhibank.repository;

import com.BankingApp.entities.JournalVoucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalVoucherRepository extends JpaRepository<JournalVoucher, Long> {
}
