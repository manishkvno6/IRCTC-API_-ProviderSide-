package com.nandrekha.controller;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nandrekha.dto.Passesngers;
import com.nandrekha.dto.Ticket;
import com.nandrekha.service.TicketBookingService;

@RestController
public class IrctcRestController {

	private TicketBookingService service;

	public IrctcRestController(TicketBookingService service) {
		this.service = service;
	}

	@PostMapping(value = "/book", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passesngers passDetails) {
		Ticket bookTicket = service.bookTicket(passDetails);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
	}

	@GetMapping(value="/bookings", produces="application/json")
	public Collection<Ticket> getAllTicket() {
		return service.getAllBookedTicket();
	}

}
