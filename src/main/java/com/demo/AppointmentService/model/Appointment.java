package com.demo.AppointmentService.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int userId;
	private int serviceCenterId;
	private LocalDateTime appointmentTime;
	private int productId;
	private int paymentId;
}
