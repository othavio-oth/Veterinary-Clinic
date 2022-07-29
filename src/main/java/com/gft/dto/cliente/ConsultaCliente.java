package com.gft.dto.cliente;

import java.util.List;

import com.gft.dto.cachorro.ConsultaCachorro;

public class ConsultaCliente {
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;
	private List<ConsultaCachorro> pets;
	
	
	public ConsultaCliente() {
	}


	
	public ConsultaCliente(Long id, String nome, String cpf, String email, String telefone, String registroCliente,
			List<ConsultaCachorro> pets) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.registroCliente = registroCliente;
		this.pets = pets;
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



	public List<ConsultaCachorro> getPets() {
		return pets;
	}


	public void setPets(List<ConsultaCachorro> pets) {
		this.pets = pets;
	}


	
}
