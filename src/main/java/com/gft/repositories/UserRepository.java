package com.gft.repositories;

<<<<<<< HEAD
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
=======
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import org.springframework.stereotype.Repository;

import com.gft.entities.Usuario;

<<<<<<< HEAD
@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {

	 Optional<Usuario>findByEmail(String email);


=======

@Repository
public interface UserRepository extends JpaRepository<Usuario, UUID> {
	Usuario findByUsername(String username);
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
}
