package com.gft.entities;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atendimento")
public class Atendimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="tutor_id")
	private Cliente tutorId;
	
	@ManyToOne
	@JoinColumn(name="cachorro_id")
	private Cachorro cachorroId;
	
	@ManyToOne
	@JoinColumn(name="veterinario_id")
	private Veterinario veterinarioId;
	
	
	@Embedded
	private DadosDoAnimalNoDia dados;
<<<<<<< HEAD
	
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	private String comentarios;
	
	private LocalDateTime dataEHora;
	
	
	public Atendimento(){
	}

	public Atendimento(Long id, Cliente tutorId, Cachorro cachorroId, Veterinario veterinarioId, DadosDoAnimalNoDia dados,
			String comentarios, LocalDateTime dataEHora) {
		this.id = id;
		this.tutorId = tutorId;
		this.cachorroId = cachorroId;
		this.veterinarioId = veterinarioId;
		this.dados = dados;
		this.comentarios = comentarios;
		this.dataEHora = dataEHora;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getTutorId() {
		return tutorId;
	}


	public void setTutorId(Cliente tutorId) {
		this.tutorId = tutorId;
	}

	public Cachorro getCachorroId() {
		return cachorroId;
	}




	public void setCachorroId(Cachorro cachorroId) {
		this.cachorroId = cachorroId;
	}




	public Veterinario getVeterinarioId() {
		return veterinarioId;
	}




	public void setVeterinarioId(Veterinario veterinarioId) {
		this.veterinarioId = veterinarioId;
	}




	public DadosDoAnimalNoDia getDados() {
		return dados;
	}
	public void setDados(DadosDoAnimalNoDia dados) {
		this.dados = dados;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public LocalDateTime getDataEHora() {
		return dataEHora;
	}
	public void setDataEHora(LocalDateTime dataEHora) {
		this.dataEHora = dataEHora;
	}
	
	
	
	
	
}
