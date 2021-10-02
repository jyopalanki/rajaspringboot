package com.javatechie.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.tx.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
