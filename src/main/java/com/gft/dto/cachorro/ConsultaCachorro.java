package com.gft.dto.cachorro;

import com.gft.entities.Cachorro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConsultaCachorro {

	private Long id;
	private String nome;
	private String raca;
	private String carteirinha;
	private ConsultaCachorroTutor tutor;

}
