package com.madan.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madan.demo.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	
	List<Transaction> findByCustomerIdAndDateGreaterThan(Integer customerId, Date date);

}
