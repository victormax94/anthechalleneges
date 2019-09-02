package it.challenge.sales.salesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.challenge.sales.salesproject.entities.Ticket;



public interface TicketRepository  extends JpaRepository<Ticket, Long> {

}
