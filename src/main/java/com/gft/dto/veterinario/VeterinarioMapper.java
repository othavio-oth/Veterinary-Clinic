package com.gft.dto.veterinario;

import com.gft.entities.Veterinario;

public class VeterinarioMapper {
	
	public static Veterinario fromDto(VeterinarioDTO dto) {
		return new Veterinario(null, dto.getNome(), dto.getRegistro(), dto.getEmail(), dto.getTelefone(), null);
	}
	
	
	public static ConsultaVeterinario fromEntity(Veterinario veterinario) {
		return new ConsultaVeterinario(veterinario.getId(), veterinario.getNome(), veterinario.getRegistro(), veterinario.getEmail(),
				veterinario.getTelefone());
	}

}
