package com.gft.dto.atendimento;

import java.util.Date;

public class AtendimentoDTO {

	private Long tutorId;
	private Long cachorroId;
	private Long veterinarioId;
	private DadosDoAnimaDTO dados;
	private String comentarios;
	private Date dataEHora;
	
	
	
	public AtendimentoDTO( Long tutorId, Long cachorroId, Long veterinarioId, DadosDoAnimaDTO dados, String comentarios,
			Date dataEHora) {
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
	public Date getDataEHora() {
		return dataEHora;
	}
	public void setDataEHora(Date dataEHora) {
		this.dataEHora = dataEHora;
	}
	
	

}
