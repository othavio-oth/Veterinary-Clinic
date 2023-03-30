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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "atendimento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "tutor_id")
	private Cliente tutorId;

	@ManyToOne
	@JoinColumn(name = "cachorro_id")
	private Cachorro cachorroId;

	@ManyToOne
	@JoinColumn(name = "veterinario_id")
	private Veterinario veterinarioId;

	@Embedded
	private DadosDoAnimalNoDia dados;

	private String comentarios;

	private LocalDateTime dataEHora;

}
