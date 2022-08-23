package com.demo.AppointmentService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.AppointmentService.dao.AppointmentRepository;
import com.demo.AppointmentService.model.Appointment;
@Service
public class AppointmentServiceImpl implements AppointmentService{
	@Autowired
	AppointmentRepository repository;

	@Override
	public Appointment makeAppointment(Appointment appointment) {
		return repository.save(appointment);
	}

	@Override
	public List<Appointment> showAllAppointments() {
		return repository.findAll();
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAppointment(int id) {
		Optional<Appointment> appointment = repository.findById(id);
		if(appointment.isPresent()) {
			repository.deleteById(id);
			return "Appointment deleted successfully";
		}
		return null;
	}

	@Override
	public List<Appointment> showAppointmentByServiceCenters(int serviceCenterId) {
		Optional<List<Appointment>> appointment = repository.findByServiceCenterId(serviceCenterId);
		List<Appointment> appointments = new ArrayList<>();
		if(appointment.isPresent()) {
			appointments = appointment.get();
		}
		return appointments;
	}

	@Override
	public List<Appointment> showAppointmentByUsers(int userId) {
		Optional<List<Appointment>> appointment = repository.findByUserId(userId);
		List<Appointment> appointments = new ArrayList<>();
		if(appointment.isPresent()) {
			appointments = appointment.get();
		}
		return appointments;
	}

}
