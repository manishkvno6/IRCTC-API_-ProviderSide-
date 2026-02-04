package com.nandrekha.service;

import java.util.Collection;

import com.nandrekha.dto.Passesngers;
import com.nandrekha.dto.Ticket;

public interface TicketBookingService {

	public Ticket bookTicket(Passesngers passDetails);
	
	public Collection<Ticket> getAllBookedTicket();
}
