package com.gft.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Cachorro;
import com.gft.exception.ApiException;
import com.gft.repositories.CachorroRepository;

@Service
public class CachorroService {
	
	@Autowired
	private CachorroRepository cachorroRepository;
	
	
	public Cachorro salvarCachorro(Cachorro cachorro) {
		Optional<Cachorro> c = cachorroRepository.findByCarteirinha(cachorro.getCarteirinha());
		if(c.isPresent()) {
			throw new ApiException("Carteirinha já está sendo usada por outro cachorro");
		}
		
					return cachorroRepository.save(cachorro);


	}
	
	public List<Cachorro> listarCachorros(){
		List<Cachorro> todosOsCachorros =  cachorroRepository.findAll();
		List<Cachorro> ativos = new ArrayList<Cachorro>();;
		
		for (Cachorro cachorro : todosOsCachorros) {
			if(cachorro.isStatus()==true) {
				ativos.add(cachorro);
			}
		}
		
		return ativos;
	}

	
	
	
	public Cachorro buscarPorId(Long id) {
		Optional<Cachorro> cachorro = cachorroRepository.findById(id);
		return cachorro.orElseThrow(()-> new EntityNotFoundException("Cachorro não encontrado"));	
	}
	
	public Cachorro buscarPorCarteirinha(String carteirinha) {
		Optional<Cachorro> cachorro = cachorroRepository.findByCarteirinha(carteirinha) ;
		return cachorro.orElseThrow(()-> new EntityNotFoundException("Cachorro não vinculada a nenhum doguinho"));	
	}
	
	
	
	public Cachorro  atualizarCachorro(Cachorro atualizado, Long id) {
		Cachorro desatualizado = this.buscarPorId(id);
		atualizado.setId(desatualizado.getId());
		return cachorroRepository.save(atualizado);
	}
	
	
	public void deletarCachorro(Long id) {
		Cachorro cachorro = this.buscarPorId(id);
		cachorro.setStatus(false);
		cachorroRepository.save(cachorro);
	}

}
