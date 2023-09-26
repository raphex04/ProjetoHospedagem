package com.hospedagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospedagem.entities.Funcionario;

public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long>{
	
}