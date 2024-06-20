package com.vlup.vlnidhibank.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.MemberEntity;




@Repository
public interface MemberEntityRepository extends JpaRepository<MemberEntity, Integer> {

	

}





