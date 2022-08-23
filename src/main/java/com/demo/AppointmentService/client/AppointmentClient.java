package com.demo.AppointmentService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@FeignClient(name = "payment-service")
public interface AppointmentClient {
	@GetMapping("/api/payment")
    RestTemplate getPaymentById(@PathVariable int id);
}
