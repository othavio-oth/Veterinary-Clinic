package com.gft.entities;

import javax.persistence.Embeddable;

import com.gft.dto.atendimento.DadosDoAnimaDTO;

@Embeddable
public class DadosDoAnimalNoDia {

<<<<<<< HEAD
	String peso;
	String altura;
=======
	Double peso;
	Double altura;
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	String idade;
	
	
	public DadosDoAnimalNoDia(DadosDoAnimaDTO dto) {
		this.peso = dto.getPeso();
		this.altura = dto.getAltura();
		this.idade = dto.getIdade();
	}
<<<<<<< HEAD
	
	


	public DadosDoAnimalNoDia(String peso, String altura, String idade) {
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}


=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de


	public DadosDoAnimalNoDia() {
	}


<<<<<<< HEAD
	public String getPeso() {
=======
	public Double getPeso() {
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
		return peso;
	}


<<<<<<< HEAD
	public void setPeso(String peso) {
=======
	public void setPeso(Double peso) {
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
		this.peso = peso;
	}


<<<<<<< HEAD
	public String getAltura() {
=======
	public Double getAltura() {
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
		return altura;
	}


<<<<<<< HEAD
	public void setAltura(String altura) {
=======
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
