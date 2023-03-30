package com.gft.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(unique = true)
	private String cpf;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String telefone;
	@Column(unique = true)
	private String registroCliente;

	@JsonIgnore
	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
	private List<Cachorro> pets;

	@JsonIgnore
	@OneToMany(mappedBy = "tutorId")
	private List<Atendimento> atendimentos;
	private boolean status = true;

	public List<Cachorro> getPets() {

		List<Cachorro> ativos = new ArrayList<>();
		for (Cachorro cachorro : pets) {
			ativos.add(cachorro);
		}

		return ativos;
	}

}
