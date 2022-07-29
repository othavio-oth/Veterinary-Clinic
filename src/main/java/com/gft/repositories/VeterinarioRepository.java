package com.gft.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.entities.Veterinario;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {

	
	Optional<Veterinario> findByEmail(String email);
	Optional<Veterinario> findByTelefone(String telefone);
	Optional<Veterinario> findByRegistro(String registro);


}
