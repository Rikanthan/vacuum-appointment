package com.demo.AppointmentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.AppointmentService.model.Appointment;
import com.demo.AppointmentService.model.Payment;
import com.demo.AppointmentService.service.AppointmentServiceImpl;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {
	static final String api = "http://localhost:8084/api/payment";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/getPayment")
	public String getPayment() {
		//Payment payment = restTemplate.exchange(api, HttpMethod.GET, null,Payment.class).getBody();
	//	System.out.println("payment is : "+ payment);
		return restTemplate.exchange(api, HttpMethod.GET, null,String.class).getBody();
	}
	
	@Autowired
	AppointmentServiceImpl service;
	
	@PostMapping
	public Appointment addAppointment(@RequestBody Appointment appointment) {
		return service.makeAppointment(appointment);
	}
	
	@GetMapping
	public List<Appointment> showAllAppointments(){
		return service.showAllAppointments();
	}
	
	@DeleteMapping
	public String deletebyId(@RequestParam int id) {
		return service.deleteAppointment(id);
	}
	
	@GetMapping("/byServiceCenter")
	public List<Appointment> showAppointmentsByServiceCenter(@RequestParam int id){
		return service.showAppointmentByServiceCenters(id);
	}
	
	@GetMapping("/byUser")
	public List<Appointment> showAppointmentsByUser(@RequestParam int id){
		return service.showAppointmentByUsers(id);
	}
	
	@PutMapping
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		return service.updateAppointment(appointment);
	}
	
}
