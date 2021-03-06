package br.com.pontoService.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pontoService.model.Ponto;
import br.com.pontoService.repository.PontoRepository;

@Service
public class PontoService {
	
	@Autowired
	PontoRepository userRepository;
	
	public Ponto save(Ponto ponto) {
		return this.userRepository.save(ponto);
	}
	
	public Optional<Ponto> findById(int id) {
		return userRepository.findById(id);
	}
	
	public Collection<Ponto> findAll() {
		return userRepository.findAll();
	}
}
