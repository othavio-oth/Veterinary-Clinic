package com.gft.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Veterinario;
import com.gft.exception.ApiException;
import com.gft.repositories.VeterinarioRepository;

@Service
public class VeterinarioService {
	
	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	public Veterinario salvarVeterinario(Veterinario veterinario) {
		
		
		Optional<Veterinario> b = veterinarioRepository.findByEmail(veterinario.getEmail());
		if(b.isPresent()) {
			throw new ApiException("Email já está sendo usada por outro veterinário");
		}
		Optional<Veterinario> c = veterinarioRepository.findByTelefone(veterinario.getTelefone());
		if(c.isPresent()) {
			throw new ApiException("Telefone já está sendo usada por outro veterinário");
		}
		Optional<Veterinario> d = veterinarioRepository.findByRegistro(veterinario.getRegistro());
		if(d.isPresent()) {
			throw new ApiException("Registro já está sendo usada por outro veterinário");
		}
		return veterinarioRepository.save(veterinario);
	}
	
	public List<Veterinario> listarVeterinarios(){
		List<Veterinario> todos =  veterinarioRepository.findAll();
		List<Veterinario> ativos = new ArrayList<Veterinario>();;
		
		for (Veterinario veterinario : todos) {
			if(veterinario.isStatus()==true) {
				ativos.add(veterinario);
			}
		
	}	
		return ativos;
	
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
