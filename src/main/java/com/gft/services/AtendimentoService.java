package com.gft.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Atendimento;
import com.gft.repositories.AtendimentoRepository;

@Service	
public class AtendimentoService {

	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	
	public Atendimento registrar(Atendimento atendimento) {
		return atendimentoRepository.save(atendimento);
	}
	
	public List<Atendimento> mostrarTodosOsAtendimnentos(){
		return atendimentoRepository.findAll();
	}
	
	public Atendimento buscarPorId(Long id) {
		Optional<Atendimento> atendimento = atendimentoRepository.findById(id);
		return atendimento.orElseThrow(() ->  new EntityNotFoundException("Atendimento não encontrado"));
	}
	
}
