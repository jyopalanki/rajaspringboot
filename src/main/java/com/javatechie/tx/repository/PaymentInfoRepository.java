package com.javatechie.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.tx.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String>{

}
