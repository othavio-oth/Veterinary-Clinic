package com.gft.repositories;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
<<<<<<< HEAD
	
	Optional<Cliente> findByCpf(String cpf);
	Optional<Cliente> findByEmail(String email);
	Optional<Cliente> findByTelefone(String telefone);
	Optional<Cliente> findByRegistroCliente(String registroCliente);

=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de

}
