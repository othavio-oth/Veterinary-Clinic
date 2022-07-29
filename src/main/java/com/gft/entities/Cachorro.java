package com.gft.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Cachorro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
<<<<<<< HEAD
	private boolean status = true;
=======
	
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	private String raca;
	
	@Column(unique = true)
	private String carteirinha;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tutor_id")
	@JsonBackReference
	private Cliente tutor;
	
	
	
	
	public Cachorro() {
		
	}

	
	public Cachorro(Long id, String nome, String raca, String carteirinha, Cliente tutor) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.carteirinha = carteirinha;
		this.tutor = tutor;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getTutor() {
		return tutor;
	}

	public void setTutor(Cliente tutor) {
		this.tutor = tutor;
	}

	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getCarteirinha() {
		return carteirinha;
	}


	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

<<<<<<< HEAD

	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}

=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	
	
	
}
