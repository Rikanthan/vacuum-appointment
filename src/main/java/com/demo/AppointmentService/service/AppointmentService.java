package com.demo.AppointmentService.service;

import java.util.List;

import com.demo.AppointmentService.model.Appointment;

public interface AppointmentService {
	Appointment makeAppointment(Appointment appointment);
	
	List<Appointment> showAllAppointments();
	
	Appointment updateAppointment(Appointment appointment);
	
	String deleteAppointment(int id);
	
	List<Appointment> showAppointmentByServiceCenters(int serviceCenterId);
	
	List<Appointment> showAppointmentByUsers(int userId);
}
