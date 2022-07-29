package com.gft.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.entities.Cachorro;

@Repository
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {
	
	Optional<Cachorro> findByCarteirinha(String carteirinha);


}
