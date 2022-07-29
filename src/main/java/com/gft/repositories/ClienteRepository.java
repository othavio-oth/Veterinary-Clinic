package com.gft.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Optional<Cliente> findByCpf(String cpf);
	Optional<Cliente> findByEmail(String email);
	Optional<Cliente> findByTelefone(String telefone);
	Optional<Cliente> findByRegistroCliente(String registroCliente);


}
