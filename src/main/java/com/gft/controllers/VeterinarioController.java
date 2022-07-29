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
<<<<<<< HEAD
import com.gft.entities.Usuario;
import com.gft.entities.Veterinario;
import com.gft.services.AutenticacaoService;
import com.gft.services.VeterinarioService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("v1/veterinarios")
@SecurityRequirement(name ="clinica-vet")

=======
import com.gft.entities.Role;
import com.gft.entities.Usuario;
import com.gft.entities.Veterinario;
import com.gft.entities.usuarios.Perfil;
import com.gft.services.UserService;
import com.gft.services.VeterinarioService;

@RestController
@RequestMapping("v1/veterinarios")
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
public class VeterinarioController {
	
	@Autowired
	private VeterinarioService veterinarioService;
	
<<<<<<< HEAD
	
	@Autowired
	private AutenticacaoService autenticacaoService;

	
	@PostMapping
	public ResponseEntity<ConsultaVeterinario> salvarVeterinario(@RequestBody VeterinarioDTO dto){
			
		Usuario usuario = new Usuario(dto.getEmail(),dto.getRegistro());
		autenticacaoService.criarUsuario(usuario);
=======
	@Autowired
	private UserService userService;
	@PostMapping
	public ResponseEntity<ConsultaVeterinario> salvarVeterinario(@RequestBody VeterinarioDTO dto){
		Role role = new Role(Perfil.ROLE_VETERINARIO);
		//role.setId((long) 1);
		Usuario usuario = new Usuario(null,dto.getEmail(),dto.getRegistro(),role);
		userService.salvarUsuario(usuario);
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
		Veterinario veterinario = veterinarioService.salvarVeterinario(VeterinarioMapper.fromDto(dto));
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
	}
	
	@GetMapping
	public ResponseEntity<List<ConsultaVeterinario>> listarVeterinarios(){
		return ResponseEntity.ok(VeterinarioMapper.fromEntityList(veterinarioService.listarVeterinarios()));
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<ConsultaVeterinario> buscarPorId(@RequestParam Long id){
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinarioService.buscarPorId(id)));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaVeterinario> atualizar(@RequestBody VeterinarioDTO dto, @PathVariable Long id){
		Veterinario veterinario = veterinarioService.atualizar(VeterinarioMapper.fromDto(dto), id);
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaVeterinario> deletarVeterinario(@RequestParam Long id){
		veterinarioService.deletarVeterinario(id);
		return ResponseEntity.ok().build();
	}
	
<<<<<<< HEAD
	
	
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
}
