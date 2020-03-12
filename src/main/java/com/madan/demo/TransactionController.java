package com.madan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madan.demo.model.Transaction;
import com.madan.demo.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private TransactionRepository txnRepository;

	@PostMapping("/")
	public void createTransaction(@RequestBody Transaction transaction) {

		calculateRewards(transaction);

		transaction = txnRepository.save(transaction);

	}

	private void calculateRewards(Transaction t) {
		Integer txnAmount = t.getAmount();
		Integer rewardAmount = txnAmount > 50 ? txnAmount > 100 ? (txnAmount - 100) * 2 + 50 : txnAmount - 50 : 0;
		t.setRewardAmount(rewardAmount);
	}

}
