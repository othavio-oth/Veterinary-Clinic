package com.gft.dto.atendimento;

import com.gft.entities.DadosDoAnimalNoDia;

public class DadosDoAnimaDTO {
	

	String peso;
	String altura;
	String idade;
	
	public DadosDoAnimaDTO(String peso, String altura, String idade) {
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}
	public DadosDoAnimaDTO() {
	}
	public DadosDoAnimaDTO(DadosDoAnimalNoDia dados) {
		peso = dados.getPeso();
		altura = dados.getAltura();
		idade = dados.getIdade();
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
