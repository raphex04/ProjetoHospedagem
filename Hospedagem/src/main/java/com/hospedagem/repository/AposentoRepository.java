package com.hospedagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospedagem.entities.Aposento;

public interface AposentoRepository  extends JpaRepository<Aposento, Long>{
	
}