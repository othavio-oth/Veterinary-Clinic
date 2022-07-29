package com.gft.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.entities.Cliente;
import com.gft.exception.ApiException;
import com.gft.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired	
	private ClienteRepository clienteRepository;
	
	public Cliente salvarCliente(Cliente cliente) {
		Optional<Cliente> a = clienteRepository.findByCpf(cliente.getCpf());
		if(a.isPresent()) {
			throw new ApiException("CPF já está sendo usada por outro cliente");
		}
		Optional<Cliente> b = clienteRepository.findByEmail(cliente.getEmail());
		if(b.isPresent()) {
			throw new ApiException("Email já está sendo usada por outro cliente");
		}
		Optional<Cliente> c = clienteRepository.findByTelefone(cliente.getTelefone());
		if(c.isPresent()) {
			throw new ApiException("Telefone já está sendo usada por outro cliente");
		}
		Optional<Cliente> d = clienteRepository.findByRegistroCliente(cliente.getRegistroCliente());
		if(d.isPresent()) {
			throw new ApiException("Registro já está sendo usada por outro cliente");
		}
		
		
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> listarClientes(){
		
		
			List<Cliente> todos =  clienteRepository.findAll();
			List<Cliente> ativos = new ArrayList<Cliente>();;
			
			for (Cliente cliente : todos) {
				if(cliente.isStatus()==true) {
					ativos.add(cliente);
				}
			
		}	
			return ativos;
		
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
