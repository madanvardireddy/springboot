package com.madan.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Transaction {
	
	@Id
	@GeneratedValue
	Integer id;
	Integer amount;
	Integer customerId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	Date date;
	Integer rewardAmount;

}
