package com.gft.dto.veterinario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeterinarioDTO {
	private String nome;
	private String registro;
	private String email;
	private String telefone;

}
