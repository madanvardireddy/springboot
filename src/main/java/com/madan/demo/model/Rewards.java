package com.madan.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import lombok.Data;

/*@Entity
@Data
@SqlResultSetMapping(
		  name="EmployeeResult",
		  entities={
		    @EntityResult(
		      entityClass = com.madan.demo.model.Rewards.class,
		        fields={
		          @FieldResult(name="customerId",column="customerId"),
		          @FieldResult(name="year",column="year"),
		          @FieldResult(name="rewards",column="rewards"),
		          @FieldResult(name="month", column="month")})})

@NamedNativeQuery(query = "Select r.customerId as customerId, month(r.date) as month, year(r.date) as year, sum(r.rewardAmount) as rewards from Transaction r "
		+ " where r.customerId=:customerId group by r.customerId, year(r.date), month(r.date)", resultClass = Rewards.class, name = "findRewards")*/
public class Rewards implements Serializable{
	
	Integer customerId;
	Integer month;
	Integer year;
	Integer rewardAmount;
}
