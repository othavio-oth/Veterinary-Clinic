package com.gft.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "veterinario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Veterinario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(unique = true)
	private String registro;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String telefone;

	private boolean status;

	public boolean isStatus() {
		return status;
	}
}
