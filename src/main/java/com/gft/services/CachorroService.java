package com.gft.services;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Cachorro;
<<<<<<< HEAD
import com.gft.exception.ApiException;
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import com.gft.repositories.CachorroRepository;

@Service
public class CachorroService {
	
	@Autowired
	private CachorroRepository cachorroRepository;
	
	
	public Cachorro salvarCachorro(Cachorro cachorro) {
<<<<<<< HEAD
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
=======
		return cachorroRepository.save(cachorro);
	}
	
	public List<Cachorro> listarCachorros(){
		return cachorroRepository.findAll();
	}
	
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	public Cachorro buscarPorId(Long id) {
		Optional<Cachorro> cachorro = cachorroRepository.findById(id);
		return cachorro.orElseThrow(()-> new EntityNotFoundException("Cachorro não encontrado"));	
	}
	
<<<<<<< HEAD
	public Cachorro buscarPorCarteirinha(String carteirinha) {
		Optional<Cachorro> cachorro = cachorroRepository.findByCarteirinha(carteirinha);
		return cachorro.orElseThrow(()-> new EntityNotFoundException("Cachorro não vinculada a nenhum cachorro"));	
	}
	
=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	public Cachorro  atualizarCachorro(Cachorro atualizado, Long id) {
		Cachorro desatualizado = this.buscarPorId(id);
		atualizado.setId(desatualizado.getId());
		return cachorroRepository.save(atualizado);
	}
	public void deletarCachorro(Long id) {
		Cachorro cachorro = this.buscarPorId(id);
<<<<<<< HEAD
		cachorro.setStatus(false);
		cachorroRepository.save(cachorro);
=======
		cachorroRepository.delete(cachorro);
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	}

}
