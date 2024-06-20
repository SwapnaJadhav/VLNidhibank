package com.vlup.vlnidhibank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.ShareDetail;

@Repository
public interface ShareDetailRepository extends JpaRepository<ShareDetail , Integer>{

//	@Query("SELECT s FROM ShareDetails s JOIN s.bank_branch b JOIN s.members m WHERE m.memberCode = :memberCode")
//    List<ShareDetail> findSharesByMemberCode(@Param("memberCode") Integer memberCode);
}
