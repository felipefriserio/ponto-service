package br.com.pontoService.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ponto")
public class Ponto {
	
	@Id 
	private LocalDateTime marcacao;
	
	public LocalDateTime getMarcacao() {
		return marcacao;
	}
	public void setMarcacao(String valor) {
		this.marcacao = LocalDateTime.now();;
	}

}
