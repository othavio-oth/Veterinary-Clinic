package com.gft.dto.veterinario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gft.entities.Veterinario;

public class VeterinarioMapper {
	
	public static Veterinario fromDto(VeterinarioDTO dto) {
<<<<<<< HEAD
		return new Veterinario(null, dto.getNome(), dto.getRegistro(), dto.getEmail(), dto.getTelefone());
	}
	
	
	
=======
		return new Veterinario(null, dto.getNome(), dto.getRegistro(), dto.getEmail(), dto.getTelefone(), null);
	}
	
	
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
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
