package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.Nominee;


@Repository
public interface NomineeRepository  extends JpaRepository<Nominee, Integer>{

}
