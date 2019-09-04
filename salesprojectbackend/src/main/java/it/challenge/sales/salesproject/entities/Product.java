package it.challenge.sales.salesproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import it.challenge.sales.salesproject.costants.TaxesCostants;


@Entity
public class Product {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	private double priceWithTaxes;
	private boolean isImported;
	private int type;




	public Product() {
	}

	public Product(String name, double price, boolean isImported, int type) {
		super();
		this.name = name;
		this.price = price;
		this.priceWithTaxes= this.getPriceWithTaxes(price,type,isImported);
		this.isImported = isImported;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isImported() {
		return isImported;
	}
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getPriceWithTaxes(double price,int type,boolean isImported) {

		double totalTaxes= (type==3? TaxesCostants.BASIC_TAX:0.0)+ (isImported? TaxesCostants.IMPORTED_ADDITIONAL_TAX : 0.0);
		double realPrice= this.round(((totalTaxes/100)*price)+price,2);
		return realPrice;

	}

	public double round(double value, int places) { 
		if (places < 0) throw new IllegalArgumentException();
		long factor = (long) Math.pow(10, places); 
		value = value * factor;
		long tmp = Math.round(value); 
		
		return (double) tmp / factor;
		
	}

	public double amountOfTaxes() {

		return this.priceWithTaxes-this.price;
	}

	public double getPriceWithTaxes() {
		return this.priceWithTaxes;
	}

	public void setPriceWithTaxes(double priceWithTaxes) {
		this.priceWithTaxes = priceWithTaxes;
	}
	
	
	

}
