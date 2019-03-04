package br.com.pontoService.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pontoService.model.Ponto;
import br.com.pontoService.service.PontoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ponto")
public class PontoController {

	@Autowired
	PontoService pontoService;
	
	@GetMapping("/id/{id}")
	public Optional<Ponto> findById(@PathVariable int id){
		return this.pontoService.findById(id);
	}
	
	@GetMapping
	public Collection<Ponto> findAll(){
		return this.pontoService.findAll();
	}
	
	@PostMapping
	public Ponto create(@RequestBody Ponto ponto) {
		return this.pontoService.save(ponto);
	} 
	
}
