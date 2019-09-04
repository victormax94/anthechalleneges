package it.challenge.sales.salesproject;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import it.challenge.sales.salesproject.entities.Product;
import it.challenge.sales.salesproject.repositories.ProductRepository;

@SpringBootApplication
@Component("it.challenge.sales.salesproject.controllers")
@EnableJpaAuditing
public class SalesprojectApplication {
	
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SalesprojectApplication.class, args);
	}
	
	@EventListener
	public void seed(ContextRefreshedEvent event) {
		this.seedRandomProducts();
	}
	
	private void seedRandomProducts() {
		
//		for(int i=0;i<100;i++) {
//			 Random rd = new Random();
//			 double price=this.truncateDecimal((rd.nextDouble()*10)+20.0,2).doubleValue();
//			 boolean isImported= Math.random()<0.5? false:true;
//			 int type= rd.nextInt(4);
//			productRepository.save(new Product("PRODUCT N"+i,price,isImported, type));
//		}
		
//		productRepository.save(new Product("book",12.49,false,0));
//		productRepository.save(new Product("music CD",14.99,false,3));
//		productRepository.save(new Product("chocolate bar",0.85,false,1));
//		productRepository.save(new Product("box of chocolates",10.0,true,1));
//		productRepository.save(new Product("bottle of perfume",47.50,true,3));
//		productRepository.save(new Product("bottle of perfume",27.99,true,3));
//		productRepository.save(new Product("bottle of perfume",18.99,false,3));
//		productRepository.save(new Product("packet of headache pills",9.75,false,2));
//		productRepository.save(new Product("box of chocolates",11.25,true,1));
//		
	}
	
//	private  BigDecimal truncateDecimal(double x,int numberofDecimals)
//	{
//	    if ( x > 0) {
//	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
//	    } else {
//	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
//	    }
//	}
	
	

}
