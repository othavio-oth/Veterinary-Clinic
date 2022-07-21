package com.gft.dto.veterinario;

public class ConsultaVeterinario {
	
	private Long id;
	private String nome;
	private String registro;
	private String email;
	private String telefone;
	public ConsultaVeterinario(Long id, String nome, String registro, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.registro = registro;
		this.email = email;
		this.telefone = telefone;
	}
	public ConsultaVeterinario() {
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
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
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
	
	


}
