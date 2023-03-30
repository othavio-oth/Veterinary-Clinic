package com.gft.dto.atendimento;

import com.gft.dto.cachorro.ConsultaCachorro;
import com.gft.dto.cachorro.ConsultaCachorroTutor;
import com.gft.dto.veterinario.ConsultaVeterinario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConsultaAtendimento {
	private Long id;
	private ConsultaCachorroTutor tutor;
	private ConsultaCachorro cachorro;
	private ConsultaVeterinario veterinario;
	private DadosDoAnimaDTO dados;
	private String comentarios;
	private String dataEHora;

}
