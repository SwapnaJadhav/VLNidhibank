package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer>{

}
