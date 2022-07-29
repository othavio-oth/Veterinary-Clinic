package com.gft.dto.atendimento;

import com.gft.entities.DadosDoAnimalNoDia;

public class DadosDoAnimaDTO {
	

<<<<<<< HEAD
	String peso;
	String altura;
	String idade;
	
	public DadosDoAnimaDTO(String peso, String altura, String idade) {
=======
	Double peso;
	Double altura;
	String idade;
	
	public DadosDoAnimaDTO(Double peso, Double altura, String idade) {
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
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
<<<<<<< HEAD
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
=======
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
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
		this.altura = altura;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	

}
