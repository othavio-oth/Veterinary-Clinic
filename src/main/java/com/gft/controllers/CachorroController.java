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

import com.gft.dto.cachorro.CachorroDTO;
import com.gft.dto.cachorro.CachorroMapper;
import com.gft.dto.cachorro.ConsultaCachorro;
import com.gft.entities.Cachorro;
import com.gft.services.CachorroService;
import com.gft.services.ClienteService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("v1/pets")
@SecurityRequirement(name ="clinica-vet")
public class CachorroController {
	
	
	@Autowired
	private CachorroService cachorroService;
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<ConsultaCachorro> salvarCachorro(@RequestBody CachorroDTO dto){
		
		Cachorro cachorro = cachorroService.salvarCachorro(new Cachorro(null, dto.getNome(),
				dto.getRaca(),dto.getCarteirinha(),
				clienteService.buscarPorId(dto.getTutor())));
		return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ConsultaCachorro> buscarPorId(@RequestParam Long id){
		return ResponseEntity.ok(CachorroMapper.fromEntity(cachorroService.buscarPorId(id)));
	}
	
	
	@GetMapping
	public ResponseEntity<List<ConsultaCachorro>> listarCachorros(){
		List<ConsultaCachorro> cachorros = CachorroMapper.fromEntityList(cachorroService.listarCachorros());
		return ResponseEntity.ok(cachorros);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaCachorro> atualizarCachorro(@RequestBody CachorroDTO dto, @PathVariable Long id){
		Cachorro cachorro = cachorroService.atualizarCachorro((new Cachorro(null, dto.getNome(),
				dto.getRaca(),dto.getCarteirinha(),
				clienteService.buscarPorId(dto.getTutor()))), id);
		
		return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
	}
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaCachorro> deletarCachorro(Long id){
		cachorroService.deletarCachorro(id);
		return ResponseEntity.ok().build();
	}

}
