package com.demo.AppointmentService.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.AppointmentService.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
  Optional<Appointment> findById(int id);
  
  Optional<List<Appointment>> findByUserId(int id);
  
  Optional<List<Appointment>> findByServiceCenterId(int id);
}
