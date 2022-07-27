package com.gft.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Cliente;
import com.gft.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> listarClientes(){
		return clienteRepository.findAll();
	}
	
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(()-> new EntityNotFoundException("Cliente não enocntrado"));	
	}
	
	public Cliente atualizar(Cliente atualizado, Long id) {
		Cliente original = this.buscarPorId(id);
		atualizado.setId(original.getId());
		return clienteRepository.save(atualizado);
	}
	
	public void deletarCliente(Long id) {
		Cliente cliente = this.buscarPorId(id);
		clienteRepository.delete(cliente);
	}
	
}
