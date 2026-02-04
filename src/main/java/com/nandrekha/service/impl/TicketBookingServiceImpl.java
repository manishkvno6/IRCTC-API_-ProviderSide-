package com.nandrekha.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nandrekha.dto.Passesngers;
import com.nandrekha.dto.Ticket;
import com.nandrekha.service.TicketBookingService;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {

	// Map to store all booked tickets
	// Key = PNR number (Integer)
	// Value = Ticket object
	Map<Integer, Ticket> allTickets = new HashMap<>();

	@Override
	public Ticket bookTicket(Passesngers passDetails) {

		// Create a new Ticket object
		Ticket ticket = new Ticket();

		// Used to generate random PNR number
		Random random = new Random();

		// Generate random PNR (0 to 99)
		int pnr = random.nextInt(100);

		// Set generated PNR into ticket
		ticket.setPNR(pnr);

		// Copy passenger details into ticket object
		// (name, age, email, etc. if fields match)
		BeanUtils.copyProperties(passDetails, ticket);
		
		ticket.setStatus("WL");

		// Store ticket in map using PNR as key
		allTickets.put(pnr, ticket);

		// Return booked ticket to caller
		return ticket;
	}

	@Override
	public Collection<Ticket> getAllBookedTicket() {

		// Return all stored tickets as a collection
		return allTickets.values();
	}
}
