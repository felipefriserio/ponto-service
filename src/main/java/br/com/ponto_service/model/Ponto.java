package br.com.ponto_service.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

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
	public void setMarcacao(LocalDateTime marcacao) {
		this.marcacao = marcacao;
	}

}
