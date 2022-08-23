package com.demo.AppointmentService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Payment {
	private int id;
	private boolean paymentStatus;
	private double amount;
}
