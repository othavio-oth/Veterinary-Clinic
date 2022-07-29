package com.gft.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gft.entities.Usuario;
import com.gft.repositories.UserRepository;

@Service
public class AutenticacaoService implements UserDetailsService	 {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> usuario = userRepository.findByEmail(email);
		
		if(usuario.isPresent()){
			return usuario.get();
			
			}
		throw new  UsernameNotFoundException("Dados inválidos");
		}

	public Usuario criarUsuario(Usuario usuario) {
		System.out.println(usuario.getPassword());
		usuario.setPassword(passwordEncoder().encode(usuario.getPassword()));
		System.out.println(usuario.getPassword());

		return userRepository.save(usuario);
	}
	
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
