package com.gft.dto.atendimento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AtendimentoDTO {

	private Long tutorId;
	private Long cachorroId;
	private Long veterinarioId;
	private DadosDoAnimaDTO dados;
	private String comentarios;
	private String dataEHora;
	
	
	
	public AtendimentoDTO( Long tutorId, Long cachorroId, Long veterinarioId, DadosDoAnimaDTO dados, String comentarios,
			String dataEHora) {
		this.tutorId = tutorId;
		this.cachorroId = cachorroId;
		this.veterinarioId = veterinarioId;
		this.dados = dados;
		this.comentarios = comentarios;
		this.dataEHora = dataEHora;
	}
	public AtendimentoDTO() {
	}
	
	
	public Long getTutorId() {
		return tutorId;
	}
	public void setTutorId(Long tutorId) {
		this.tutorId = tutorId;
	}
	public Long getCachorroId() {
		return cachorroId;
	}
	public void setCachorroId(Long cachorroId) {
		this.cachorroId = cachorroId;
	}
	public Long getVeterinarioId() {
		return veterinarioId;
	}
	public void setVeterinarioId(Long veterinarioId) {
		this.veterinarioId = veterinarioId;
	}
	public DadosDoAnimaDTO getDados() {
		return dados;
	}
	public void setDados(DadosDoAnimaDTO dados) {
		this.dados = dados;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public LocalDateTime getDataEHora() {
		String str = dataEHora;
<<<<<<< HEAD
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
=======
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		return dateTime;
	}
	public void setDataEHora(String dataEHora) {
		this.dataEHora = dataEHora;
	}
	
	

}
