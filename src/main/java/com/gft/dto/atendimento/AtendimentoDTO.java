package com.gft.dto.atendimento;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AtendimentoDTO {

	private Long tutorId;
	private Long cachorroId;
	private Long veterinarioId;
	private DadosDoAnimaDTO dados;
	private String comentarios;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]'Z'", timezone = "GMT")
	private LocalDateTime dataEHora;

}
