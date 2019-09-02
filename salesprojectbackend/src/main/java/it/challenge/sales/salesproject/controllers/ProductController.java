package it.challenge.sales.salesproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.challenge.sales.salesproject.entities.Product;
import it.challenge.sales.salesproject.entities.RowOfTicket;
import it.challenge.sales.salesproject.entities.Ticket;
import it.challenge.sales.salesproject.models.CreateTicket;
import it.challenge.sales.salesproject.repositories.*;

@RestController
public class ProductController {

	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	RowOfTicketRepository rowOfTicketRepository;
	
	
	@CrossOrigin(origins = "*")
	@PostMapping("/createTicket")
	public ResponseEntity<Ticket> createTicket(@RequestBody List<CreateTicket> tickets){
		
		
		List<RowOfTicket> rows= new ArrayList<RowOfTicket>();
		
		for(CreateTicket crow:tickets) {
			Product product= productRepository.findById(crow.getProductId()).get();
			RowOfTicket row= new RowOfTicket(product,crow.getQuantity());
			rows.add(row);
		}
		
		Ticket ticket= new Ticket(rows);
		return new ResponseEntity<Ticket>(ticketRepository.save(ticket),HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getAllsTickets")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		return new ResponseEntity<List<Ticket>>(ticketRepository.findAll(),HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getAllsProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(productRepository.findAll(),HttpStatus.OK);
	}
	
	
}
