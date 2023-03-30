package com.gft.dto.cliente;

import java.util.List;

import com.gft.dto.cachorro.ConsultaCachorro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaCliente {

	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;
	private List<ConsultaCachorro> pets;

}
