package com.javatechie.tx.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.tx.dto.FlightBookingAcknowledgement;
import com.javatechie.tx.dto.FlightBookingRequest;
import com.javatechie.tx.entity.PassengerInfo;
import com.javatechie.tx.entity.PaymentInfo;
import com.javatechie.tx.repository.PassengerInfoRepository;
import com.javatechie.tx.repository.PaymentInfoRepository;
import com.javatechie.tx.utils.PaymentUtils;

@Service
public class FlightBookingService {
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	 @Transactional//(readOnly = false,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		
		passengerInfo = passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		System.out.println("this is example");
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
		
	}
}