package com.javatechie.tx.dto;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.javatechie.tx.entity.PassengerInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;

}
