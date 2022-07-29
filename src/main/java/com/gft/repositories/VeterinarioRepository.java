package com.gft.repositories;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.entities.Veterinario;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
<<<<<<< HEAD
	
	Optional<Veterinario> findByEmail(String email);
	Optional<Veterinario> findByTelefone(String telefone);
	Optional<Veterinario> findByRegistro(String registro);
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de

}
