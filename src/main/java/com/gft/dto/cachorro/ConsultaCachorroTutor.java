package com.gft.dto.cachorro;

import com.gft.entities.Cliente;

public class ConsultaCachorroTutor {
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;
	
	
	public ConsultaCachorroTutor(Cliente cliente) {
		id = cliente.getId();
		nome = cliente.getNome();
		cpf = cliente.getCpf();
		email = cliente.getEmail();
		telefone = cliente.getTelefone();
		registroCliente = cliente.getRegistroCliente();
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
	
	

}
