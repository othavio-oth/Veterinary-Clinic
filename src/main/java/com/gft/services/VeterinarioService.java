package com.gft.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Veterinario;
import com.gft.repositories.VeterinarioRepository;

@Service
public class VeterinarioService {
	
	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	public Veterinario salvarVeterinario(Veterinario veterinario) {
		return veterinarioRepository.save(veterinario);
	}
	
	public List<Veterinario> listarVeterinarios(){
		return veterinarioRepository.findAll();
	}
	
	public Veterinario buscarPorId(Long id) {
		Optional<Veterinario> veterinario = veterinarioRepository.findById(id);
		return veterinario.orElseThrow(()-> new EntityNotFoundException("Veterinário não encontrado"));
	}
	
	public void deletarVeterinario(Long id) {
		Veterinario veterinario = this.buscarPorId(id);
		veterinarioRepository.delete(veterinario);
	}

	public Veterinario atualizar(Veterinario atualizado, Long id) {
		Veterinario desatualizado = this.buscarPorId(id);
		atualizado.setId(desatualizado.getId());
		return veterinarioRepository.save(atualizado);
	}

}
