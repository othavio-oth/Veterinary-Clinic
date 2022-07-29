package com.gft.dto.cachorro;

import com.gft.entities.Cachorro;

public class ConsultaCachorro {
	
	private Long id;
	private String nome;
	private String raca;
	private String carteirinha;
	private ConsultaCachorroTutor tutor;
	
	
	
	
	public  ConsultaCachorro() {
		
	}

	public ConsultaCachorro(Long id, String nome, String raca, String carteirinha, ConsultaCachorroTutor tutor) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.carteirinha = carteirinha;
		this.tutor = tutor;
	}
	
	
	
	public ConsultaCachorro(Cachorro cachorro) {
		id = cachorro.getId();
		nome = cachorro.getNome();
		raca = cachorro.getRaca();
		carteirinha = cachorro.getCarteirinha();
		tutor = new ConsultaCachorroTutor(cachorro.getTutor());
		
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public ConsultaCachorroTutor getTutor() {
		return tutor;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

	public void setTutor(ConsultaCachorroTutor tutor) {
		this.tutor = tutor;
	}

	
}
