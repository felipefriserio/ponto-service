package br.com.pontoService.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.pontoService.enums.TipoMarcacao;

@Document(collection = "ponto")
public class Ponto {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private TipoMarcacao tipo;
	private ZonedDateTime marcacao;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TipoMarcacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMarcacao tipo) {
		this.tipo = tipo;
	}
	public ZonedDateTime getMarcacao() {
		return marcacao;
	}
	public void setMarcacao(String valor) {
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		this.marcacao = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
	}

}
