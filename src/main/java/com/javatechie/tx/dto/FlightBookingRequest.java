package com.javatechie.tx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.javatechie.tx.entity.PassengerInfo;
import com.javatechie.tx.entity.PaymentInfo;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
  private PassengerInfo passengerInfo;
  private PaymentInfo paymentInfo;
}
