package com.gft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gft.dto.veterinario.ConsultaVeterinario;
import com.gft.dto.veterinario.VeterinarioDTO;
import com.gft.dto.veterinario.VeterinarioMapper;
import com.gft.entities.User;
import com.gft.entities.Veterinario;
import com.gft.services.AuthenticationService;
import com.gft.services.VeterinarioService;

@RestController
@RequestMapping("v1/veterinarios")
public class VeterinarioController {

	@Autowired
	private VeterinarioService veterinarioService;

	@Autowired
	private AuthenticationService autenticacaoService;

	@PostMapping
	public ResponseEntity<ConsultaVeterinario> salvarVeterinario(@RequestBody VeterinarioDTO dto) {

		User usuario = new User(dto.getEmail(), dto.getRegistro());
		autenticacaoService.createUser(usuario);

		Veterinario veterinario = veterinarioService.salvarVeterinario(VeterinarioMapper.fromDto(dto));
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
	}

	@GetMapping
	public ResponseEntity<List<ConsultaVeterinario>> listarVeterinarios() {
		return ResponseEntity.ok(VeterinarioMapper.fromEntityList(veterinarioService.listarVeterinarios()));
	}

	@GetMapping("{id}")
	public ResponseEntity<ConsultaVeterinario> buscarPorId(@RequestParam Long id) {
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinarioService.buscarPorId(id)));
	}

	@PutMapping("{id}")
	public ResponseEntity<ConsultaVeterinario> atualizar(@RequestBody VeterinarioDTO dto, @PathVariable Long id) {
		Veterinario veterinario = veterinarioService.atualizar(VeterinarioMapper.fromDto(dto), id);
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaVeterinario> deletarVeterinario(@RequestParam Long id) {
		veterinarioService.deletarVeterinario(id);
		return ResponseEntity.ok().build();
	}

}
