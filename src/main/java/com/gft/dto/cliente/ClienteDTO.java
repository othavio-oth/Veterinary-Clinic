package com.gft.dto.cliente;

public class ClienteDTO {

	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;

	
	public ClienteDTO() {
	}


	public ClienteDTO(String nome, String cpf, String email, String telefone, String registroCliente) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.registroCliente = registroCliente;
		
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
}
