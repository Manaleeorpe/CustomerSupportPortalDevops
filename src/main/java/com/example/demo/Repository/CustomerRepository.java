package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	Optional<Customer> findByName(String name);

	boolean existsByName(String Name);

	boolean existsByEmail(String email);
	Customer findByEmail(String email);
}
