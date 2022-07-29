package com.gft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gft.entities.Usuario;
import com.gft.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	UserRepository repository;
	
	private BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = repository.findByUsername(username);
		return new User(user.getUsername(), user.getPassword(), true, true, true, true, user.getAuthorities());
	}
	
	
	public Usuario salvarUsuario(Usuario usuario) {
		
		usuario.setPassword(passwordEncoder().encode(usuario.getPassword()));
		
		Usuario usuarioCriado = repository.save(usuario);
		return usuarioCriado;
	}

}
