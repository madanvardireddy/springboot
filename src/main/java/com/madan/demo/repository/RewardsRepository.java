package com.madan.demo.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.madan.demo.model.Rewards;

public interface RewardsRepository { //extends JpaRepository<Rewards, Integer> {

	//@Query("Select r.customerId, function('date_format', r.date,'%Y-%m'), sum(r.rewardAmount) from Rewards r "
	//		+ " where r.customerId=:customerId group by function('date_format', r.date,'%Y-%m')")
	//public List findRewardsByCustomerId(@Param("customerId") Integer customerId);

}
