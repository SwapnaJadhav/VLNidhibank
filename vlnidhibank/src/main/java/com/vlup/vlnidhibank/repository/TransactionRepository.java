package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.ShareDetail;
import com.vlup.vlnidhibank.entity.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
