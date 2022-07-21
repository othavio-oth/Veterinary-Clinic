package com.gft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.dto.veterinario.ConsultaVeterinario;
import com.gft.dto.veterinario.VeterinarioDTO;
import com.gft.dto.veterinario.VeterinarioMapper;
import com.gft.entities.Veterinario;
import com.gft.services.VeterinarioService;

@RestController
@RequestMapping("v1/veterinarios")
public class VeterinarioController {
	
	@Autowired
	private VeterinarioService veterinarioService;
	
	@PostMapping
	public ResponseEntity<ConsultaVeterinario> salvarVeterinario(@RequestBody VeterinarioDTO dto){
		Veterinario veterinario = veterinarioService.salvarVeterinario(VeterinarioMapper.fromDto(dto));
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
	}
}
