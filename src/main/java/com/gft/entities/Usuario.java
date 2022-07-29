package com.gft.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="usuario")
public class Usuario implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String email;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	private List<Perfil> roles = new ArrayList<>();
	
	
	
	

	public Usuario() {
	}
	//get e set

	

	public long getId() {
		return id;
	}

	public Usuario(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	
	public Usuario(String email, String password, List<Perfil> roles) {
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public void setId(long id) {
		this.id = id;
	}

	public void adicionarPerfil(Perfil perfil) {
		roles.add(perfil);
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public void setPassword(String senha) {
		this.password = senha;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles;
	}



	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}



	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}



	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
