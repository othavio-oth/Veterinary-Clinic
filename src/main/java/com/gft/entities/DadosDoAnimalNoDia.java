package com.gft.entities;

import javax.persistence.Embeddable;

import com.gft.dto.atendimento.DadosDoAnimaDTO;

@Embeddable
public class DadosDoAnimalNoDia {

	Double peso;
	Double altura;
	String idade;
	
	
	public DadosDoAnimalNoDia(DadosDoAnimaDTO dto) {
		this.peso = dto.getPeso();
		this.altura = dto.getAltura();
		this.idade = dto.getIdade();
	}


	public DadosDoAnimalNoDia() {
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	
}
