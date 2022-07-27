package com.gft.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gft.entities.Usuario;


@Repository
public interface UserRepository extends JpaRepository<Usuario, UUID> {
	Usuario findByUsername(String username);
}
