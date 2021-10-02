package com.javatechie.tx.utils;

import java.util.HashMap;
import java.util.Map;

import com.javatechie.tx.exception.InsufficientAmountException;

public class PaymentUtils {

	private static Map<String, Double > paymentMap = new HashMap<>();
	
	static{
		paymentMap.put("123",12000.0);
		paymentMap.put("1234",10000.0);
		paymentMap.put("12345",800.0);
		paymentMap.put("123456",15000.0);
		
	}
	
	public static boolean  validateCreditLimit(String accNo,double paidAmount){
		if(paidAmount>paymentMap.get(accNo))
		{
			throw new InsufficientAmountException("Your Account has Insufficient Balance");
		}
		else 
			return true;
		
	}
	
	
	
	
	}
	

