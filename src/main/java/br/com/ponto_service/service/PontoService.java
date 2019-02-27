package br.com.ponto_service.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ponto_service.model.Ponto;

@Service
public class PontoService {
	
	@Autowired
	PontoService userRepository;
	
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
