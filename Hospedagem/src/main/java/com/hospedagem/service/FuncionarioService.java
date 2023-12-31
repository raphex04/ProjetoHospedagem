package com.hospedagem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospedagem.entities.Funcionario;
import com.hospedagem.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public List<Funcionario> buscaTodosFuncionarios(){
		return funcionarioRepository.findAll();
	}

	public Funcionario buscaFuncionarioCodigo(Long codigo) {
		Optional <Funcionario> funcionario = funcionarioRepository.findById(codigo);
		return funcionario.orElse(null);
	}
	public Funcionario SalvaFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	public Funcionario alterarFuncionario(Long codigo, Funcionario alterarFunc) {
		Optional <Funcionario> existeFuncionario = funcionarioRepository.findById(codigo);

		if (existeFuncionario.isPresent()) {
			alterarFunc.setCodigo(codigo);
			return funcionarioRepository.save(alterarFunc);
		}
		return null;
	}
	public boolean apagarFuncionario(Long codigo) {
		Optional <Funcionario> existeFuncionario = funcionarioRepository.findById(codigo);
		if (existeFuncionario.isPresent()) {
			funcionarioRepository.deleteById(codigo);
			return true;
		}
		return false;
	}
}