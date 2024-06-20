package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.MemberPersonalDetail;

@Repository
public interface MemberPersonalDetailRepository extends JpaRepository<MemberPersonalDetail, Integer> {
	
	
}
