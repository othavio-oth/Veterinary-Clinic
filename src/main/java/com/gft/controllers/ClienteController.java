package com.gft.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.dto.cliente.ClienteDTO;
import com.gft.dto.cliente.ClienteMapper;
import com.gft.dto.cliente.ConsultaCliente;
import com.gft.entities.Cliente;
import com.gft.entities.Role;
import com.gft.entities.Usuario;
import com.gft.entities.usuarios.Perfil;
import com.gft.services.ClienteService;
import com.gft.services.UserService;

@RestController
@RequestMapping("v1/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private UserService userService;
	
	
	Role role = new Role(Perfil.ROLE_CLIENTE);
	
	
	@PostMapping

	public ResponseEntity<ConsultaCliente> salvarCliente(@RequestBody ClienteDTO dto){
		
		Role role = new Role(Perfil.ROLE_CLIENTE);
		//role.setId((long) 2);
		Usuario usuario = new Usuario(null,dto.getEmail(),dto.getRegistroCliente(),role);
		userService.salvarUsuario(usuario);
		Cliente cliente = clienteService.salvarCliente(ClienteMapper.fromDTO(dto));
		return ResponseEntity.ok(ClienteMapper.fromEntity(cliente));
	}
	
	
	@GetMapping
	public ResponseEntity<List<ConsultaCliente>> obterTodosOsClientes(){
		return ResponseEntity.ok(clienteService.listarClientes()
				.stream() //atalho do java para a função map e outras
				.map // uma mudança  feita em todos os itens da lista
				(ClienteMapper::fromEntity)// acesso à função estática de conversão
				.collect(Collectors.toList())); //todos são adicionados à uma lista
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<ConsultaCliente> buscarPorId(@PathVariable Long id){
		return ResponseEntity.ok(ClienteMapper.fromEntity(clienteService.buscarPorId(id)));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaCliente> atualizar(@RequestBody ClienteDTO dto, @PathVariable Long id){
		Cliente cliente = clienteService.atualizar(ClienteMapper.fromDTO(dto), id);
		return ResponseEntity.ok(ClienteMapper.fromEntity(cliente));
	}

	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaCliente> deletarCliente(@PathVariable Long id){
		clienteService.deletarCliente(id);
		return ResponseEntity.ok().build();
	}

}
