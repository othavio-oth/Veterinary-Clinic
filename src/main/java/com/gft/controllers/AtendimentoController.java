package com.gft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.dto.atendimento.AtendimentoDTO;
import com.gft.dto.atendimento.AtendimentoMapper;
import com.gft.dto.atendimento.ConsultaAtendimento;
import com.gft.entities.Atendimento;
import com.gft.services.AtendimentoService;
import com.gft.services.CachorroService;
import com.gft.services.ClienteService;
import com.gft.services.VeterinarioService;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

	
	@Autowired

	private AtendimentoService atendimentoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private VeterinarioService veterinarioService;
	@Autowired
	private CachorroService cachorroService;

	@PostMapping
	public ResponseEntity<ConsultaAtendimento> registrarAtendimento(@RequestBody AtendimentoDTO dto){
		Atendimento atendimento = atendimentoService.registrar( new Atendimento(null, clienteService.buscarPorId(dto.getTutorId()),
				cachorroService.buscarPorId(dto.getCachorroId()), veterinarioService.buscarPorId(dto.getVeterinarioId()),
				AtendimentoMapper.fromDTO(dto.getDados()), dto.getComentarios(), dto.getDataEHora()));
		
		
		return ResponseEntity.ok(AtendimentoMapper.fromEntity(atendimento));
	}
}

