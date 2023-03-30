package com.gft.dto.cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String registroCliente;

}
