package com.gft.entities;

import javax.persistence.Embeddable;

import com.gft.dto.atendimento.DadosDoAnimaDTO;

@Embeddable
public class DadosDoAnimalNoDia {

	String peso;
	String altura;
	String idade;
	
	
	public DadosDoAnimalNoDia(DadosDoAnimaDTO dto) {
		this.peso = dto.getPeso();
		this.altura = dto.getAltura();
		this.idade = dto.getIdade();
	}
	
	


	public DadosDoAnimalNoDia(String peso, String altura, String idade) {
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}



	public DadosDoAnimalNoDia() {
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	
}
