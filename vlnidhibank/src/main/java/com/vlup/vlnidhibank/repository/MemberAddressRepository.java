package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.MemberAddress;


@Repository
public interface MemberAddressRepository extends JpaRepository<MemberAddress, Integer> {

}
