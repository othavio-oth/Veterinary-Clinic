package com.gft.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Cachorro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	private String raca;
	private String carteirinha;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tutor_id")
	@JsonBackReference
	private Cliente tutor;
	
	@OneToMany(mappedBy = "cachorroId")
	private List<Atendimento> atendimentos;
	
	
	
	
	public Cachorro() {
		
	}

	
	public Cachorro(Long id, String nome, String raca, String carteirinha, Cliente tutor,
			List<Atendimento> atendimentos) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.carteirinha = carteirinha;
		this.tutor = tutor;
		this.atendimentos = atendimentos;
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

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
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

	
	
	
}
