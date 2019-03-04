package br.com.pontoService.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ponto")
public class Ponto {
	
	@Id 
	private String id;
	private LocalDateTime marcacao;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getMarcacao() {
		return marcacao;
	}
	public void setMarcacao(String valor) {
		this.marcacao = LocalDateTime.now();;
	}

}
