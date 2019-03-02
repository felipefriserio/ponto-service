package br.com.pontoService.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pontoService.model.Ponto;

@Repository
public interface PontoRepository extends CrudRepository<Ponto, Integer> {

	Ponto save(Ponto ponto);
	
	Optional<Ponto> findById(Integer id);
	
	Collection<Ponto> findAll();
	
}