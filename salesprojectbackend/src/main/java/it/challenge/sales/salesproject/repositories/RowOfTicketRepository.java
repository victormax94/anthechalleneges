package it.challenge.sales.salesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.challenge.sales.salesproject.entities.Product;
import it.challenge.sales.salesproject.entities.RowOfTicket;

public interface RowOfTicketRepository  extends JpaRepository<RowOfTicket, Long> {

}
