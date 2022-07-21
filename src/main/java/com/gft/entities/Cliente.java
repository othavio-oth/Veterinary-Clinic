package com.gft.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
	private List<Cachorro> pets;
	
	@OneToMany(mappedBy = "tutorId")
	private List<Atendimento> atendimentos;

	

	public Cliente() {
		
	}

	
	
	


	public Cliente(Long id, String nome, String cpf, String email, String telefone, String registroCliente,
			List<Cachorro> pets, List<Atendimento> atendimentos) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.registroCliente = registroCliente;
		this.pets = pets;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Cachorro> getPets() {
		return pets;
	}

	public void setPets(List<Cachorro> pets) {
		this.pets = pets;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}






	public String getRegistroCliente() {
		return registroCliente;
	}






	public void setRegistroCliente(String registroCliente) {
		this.registroCliente = registroCliente;
	}
	
	
	
	
}
