package com.study.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.spring.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
