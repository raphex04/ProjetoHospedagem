package com.hospedagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospedagem.entities.Hospede;

public interface HospedeRepository  extends JpaRepository<Hospede, Long>{
	
}
