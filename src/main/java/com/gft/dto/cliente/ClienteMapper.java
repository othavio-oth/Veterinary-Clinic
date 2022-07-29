package com.gft.dto.cliente;

import java.util.Collections;
import java.util.List;

import com.gft.dto.cachorro.CachorroMapper;
import com.gft.dto.cachorro.ConsultaCachorro;
import com.gft.entities.Cliente;

public class ClienteMapper {
	
	public static Cliente fromDTO(ClienteDTO dto) {
	
		return new Cliente(null, dto.getNome(),dto.getCpf(), dto.getEmail(),dto.getTelefone(),dto.getRegistroCliente(), null, null); 

	}
	
	
	
	public static ConsultaCliente fromEntity(Cliente cliente) {
		
		List<ConsultaCachorro> cachorros = CachorroMapper.fromEntityList(cliente.getPets());
		
		
		if(cachorros==null) {
			cachorros=Collections.emptyList();
		}
		
		
		return new ConsultaCliente(cliente.getId(), cliente.getNome(),cliente.getCpf(), cliente.getEmail(),cliente.getTelefone(),
				cliente.getRegistroCliente() ,cachorros); 
	}

}
