package br.com.pontoService.model;

import java.time.LocalDateTime;
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
	private LocalDateTime marcacao;
	
	
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
	public LocalDateTime getMarcacao() {
		return marcacao;
	}
	public void setMarcacao(String valor) {
		ZonedDateTime utcZoned = ZonedDateTime.now();
		ZoneId zonaSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horarioSP = utcZoned.withZoneSameInstant(zonaSaoPaulo);
		LocalDateTime marcacao = horarioSP.toLocalDateTime();
		
		this.marcacao = marcacao;
	}

}
