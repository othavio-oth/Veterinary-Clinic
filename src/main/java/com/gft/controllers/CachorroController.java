package com.gft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.dto.cachorro.CachorroDTO;
import com.gft.dto.cachorro.CachorroMapper;
import com.gft.dto.cachorro.ConsultaCachorro;
import com.gft.entities.Cachorro;
import com.gft.services.CachorroService;
import com.gft.services.ClienteService;

@RestController
@RequestMapping("v1/pets")
public class CachorroController {
	
	
	@Autowired
	private CachorroService cachorroService;
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<ConsultaCachorro> salvarCliente(@RequestBody CachorroDTO dto){
		
		
		
		Cachorro cachorro = cachorroService.salvarCachorro(new Cachorro(null, dto.getNome(),
				dto.getRaca(),dto.getCarteirinha(),
				clienteService.buscarPorId(dto.getTutor()), null));
		return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
	}

}
