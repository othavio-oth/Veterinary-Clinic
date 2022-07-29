package com.gft.repositories;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.entities.Cachorro;

@Repository
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {
<<<<<<< HEAD
	
	Optional<Cachorro> findByCarteirinha(String carteirinha);
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de

}
