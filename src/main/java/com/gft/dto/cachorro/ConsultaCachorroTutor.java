package com.gft.dto.cachorro;

import com.gft.entities.Cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaCachorroTutor {

	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;

}
