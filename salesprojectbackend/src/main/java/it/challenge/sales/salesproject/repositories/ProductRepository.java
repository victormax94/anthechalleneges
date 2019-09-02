package it.challenge.sales.salesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.challenge.sales.salesproject.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

}
