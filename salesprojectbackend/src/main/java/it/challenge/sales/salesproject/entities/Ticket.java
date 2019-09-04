package it.challenge.sales.salesproject.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<RowOfTicket> rows;
	
	private double taxesPaid;
	private double total;
	
	
	
	public Ticket() {
	}
	public Ticket(List<RowOfTicket> rows) {
		super();
		this.rows = rows;
		this.taxesPaid=this.round(this.getTotalOfTicket(true),2);
		this.total=this.round(this.getTotalOfTicket(false),2);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<RowOfTicket> getRows() {
		return rows;
	}
	public void setRows(List<RowOfTicket> rows) {
		this.rows = rows;
	}
	
	
	
	public double getTaxesPaid() {
		return taxesPaid;
	}
	public void setTaxesPaid(double taxesPaid) {
		this.taxesPaid = taxesPaid;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	private double getTotalOfTicket(boolean onlyTaxes) {
		 double total=0.0;
		 
		 for(RowOfTicket row:this.rows) {
			
			 if(onlyTaxes)
				 total+=row.getProduct().amountOfTaxes()*row.getQuantity();
			 else
				 total+=row.getTotalPrice();
			
		 }
		 
		 return total;
		
	}
	
	public double round(double value, int places) { 
		if (places < 0) throw new IllegalArgumentException();
		long factor = (long) Math.pow(10, places); 
		value = value * factor;
		long tmp = Math.round(value); 
		
		return (double) tmp / factor;
		
	}
	
	private  BigDecimal truncateDecimal(double x,int numberofDecimals)
	{
	    if ( x > 0) {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
	    } else {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
	    }
	}
	
	

}
