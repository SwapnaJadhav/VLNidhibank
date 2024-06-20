package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingApp.entities.Advisor;
												//<entity we are working , Id is of which type>
public interface AdvisorRepository extends JpaRepository<Advisor,Integer>{

	

}
