package com.gft.services;

import java.util.List;

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
	
}
