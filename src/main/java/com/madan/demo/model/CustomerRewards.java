package com.madan.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRewards {
	
	Integer customerId;
	Integer rewardsAmount;

}
