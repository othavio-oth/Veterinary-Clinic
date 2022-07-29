package com.gft.dto.veterinario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gft.entities.Veterinario;

public class VeterinarioMapper {
	
	public static Veterinario fromDto(VeterinarioDTO dto) {
		return new Veterinario(null, dto.getNome(), dto.getRegistro(), dto.getEmail(), dto.getTelefone());
	}
	
	
	
	public static ConsultaVeterinario fromEntity(Veterinario veterinario) {
		return new ConsultaVeterinario(veterinario.getId(), veterinario.getNome(), veterinario.getRegistro(), veterinario.getEmail(),
				veterinario.getTelefone());
	}

	
	public static List<ConsultaVeterinario> fromEntityList(List<Veterinario> veterinarios) {
		List<ConsultaVeterinario> veterinariosDTO = new ArrayList<>();
		if(veterinarios==null) {
			veterinariosDTO=Collections.emptyList();
		}
		
		for (Veterinario veterinario : veterinarios) {
			ConsultaVeterinario consultaVeterinario = fromEntity(veterinario);
			
			veterinariosDTO.add(consultaVeterinario);
		}
		
		return veterinariosDTO;
	}
}
