package com.gft.dto.atendimento;

import com.gft.entities.DadosDoAnimalNoDia;

public class DadosDoAnimaDTO {
	

	Double peso;
	Double altura;
	String idade;
	
	public DadosDoAnimaDTO(Double peso, Double altura, String idade) {
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
