package com.gft.dto.atendimento;

import java.util.Date;

import com.gft.dto.cachorro.ConsultaCachorro;
import com.gft.dto.cachorro.ConsultaCachorroTutor;
import com.gft.dto.veterinario.ConsultaVeterinario;

public class ConsultaAtendimento {
	private Long id;
	private ConsultaCachorroTutor tutor;
	private ConsultaCachorro cachorro;
	private ConsultaVeterinario veterinario;
	private DadosDoAnimaDTO dados;
	private String comentarios;
	private Date dataEHora;
	
	
	
	
	public ConsultaAtendimento() {
		
	}
	
	
	public ConsultaAtendimento(Long id, ConsultaCachorroTutor tutor, ConsultaCachorro cachorro,
			ConsultaVeterinario veterinario, DadosDoAnimaDTO dados, String comentarios, Date dataEHora) {
		this.id = id;
		this.tutor = tutor;
		this.cachorro = cachorro;
		this.veterinario = veterinario;
		this.dados = dados;
		this.comentarios = comentarios;
		this.dataEHora = dataEHora;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ConsultaCachorroTutor getTutor() {
		return tutor;
	}
	public void setTutor(ConsultaCachorroTutor tutor) {
		this.tutor = tutor;
	}
	public ConsultaCachorro getCachorro() {
		return cachorro;
	}
	public void setCachorro(ConsultaCachorro cachorro) {
		this.cachorro = cachorro;
	}
	public ConsultaVeterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(ConsultaVeterinario veterinario) {
		this.veterinario = veterinario;
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
