package com.javatechie.tx.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER_INFOS")
public class PassengerInfo {
	@Id
	@GeneratedValue
	private long pId;
	private String name;
	private String email;
	private String destination;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;
}
