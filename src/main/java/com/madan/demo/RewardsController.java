package com.madan.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madan.demo.model.CustomerRewards;
import com.madan.demo.model.Transaction;
import com.madan.demo.repository.TransactionRepository;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
	
	@Autowired
	TransactionRepository txnRepo;

	@GetMapping("/{customerId}")
	public CustomerRewards getRewards(@PathVariable Integer customerId) {
		
		List<Transaction> txns = txnRepo.findByCustomerIdAndDateGreaterThan(customerId, getLastMonthLastDate());
		
		Integer rewardsAmount = txns.stream()
				.map(Transaction::getRewardAmount)
				.reduce(0, Integer::sum);
		
		CustomerRewards cr = CustomerRewards.builder().customerId(customerId).rewardsAmount(rewardsAmount).build();
		return cr;
	}
	
	public static Date getLastMonthLastDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);

        int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, max);

        return calendar.getTime();
    }

}
