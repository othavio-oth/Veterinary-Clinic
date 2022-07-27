package com.gft.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Cachorro;
import com.gft.repositories.CachorroRepository;

@Service
public class CachorroService {
	
	@Autowired
	private CachorroRepository cachorroRepository;
	
	
	public Cachorro salvarCachorro(Cachorro cachorro) {
		return cachorroRepository.save(cachorro);
	}
	
	public List<Cachorro> listarCachorros(){
		return cachorroRepository.findAll();
	}
	
	public Cachorro buscarPorId(Long id) {
		Optional<Cachorro> cachorro = cachorroRepository.findById(id);
		return cachorro.orElseThrow(()-> new EntityNotFoundException("Cachorro não encontrado"));	
	}
	
	public Cachorro  atualizarCachorro(Cachorro atualizado, Long id) {
		Cachorro desatualizado = this.buscarPorId(id);
		atualizado.setId(desatualizado.getId());
		return cachorroRepository.save(atualizado);
	}
	public void deletarCachorro(Long id) {
		Cachorro cachorro = this.buscarPorId(id);
		cachorroRepository.delete(cachorro);
	}

}
