package com.gft.entities;

import javax.persistence.Embeddable;

import com.gft.dto.atendimento.DadosDoAnimaDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosDoAnimalNoDia {

	String peso;
	String altura;
	Integer idade;

	public DadosDoAnimalNoDia(DadosDoAnimaDTO dto) {
		this.peso = dto.getPeso();
		this.altura = dto.getAltura();
		this.idade = dto.getIdade();
	}

}
