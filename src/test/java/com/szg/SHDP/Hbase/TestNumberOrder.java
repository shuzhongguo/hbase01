package com.szg.SHDP.Hbase;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szg.SHDP.entity.NumberOrder;
import com.szg.SHDP.repository.NumberOrderRep;

public class TestNumberOrder {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/szg/SHDP/config/applicationContext.xml",TestNumberOrder.class);
		NumberOrderRep numerOrderRep = context.getBean(NumberOrderRep.class);
		List<NumberOrder> nums = numerOrderRep.findAll();
		System.out.println(nums.size());
		System.out.println(nums);
	}
}
