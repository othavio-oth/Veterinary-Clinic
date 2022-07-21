package com.gft.dto.cachorro;

public class CachorroDTO {
	
	private String nome;
	private String raca;
	private String carteirinha;
	private Long tutor;
	
	
	
	
	public CachorroDTO() {
	}

	public CachorroDTO( String nome, String raca, String carteirinha, Long tutor) {
		this.nome = nome;
		this.raca = raca;
		this.carteirinha = carteirinha;
		this.tutor = tutor;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Long getTutor() {
		return tutor;
	}

	public void setTutor(Long tutor) {
		this.tutor = tutor;
	}

	
	public String getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}



}
