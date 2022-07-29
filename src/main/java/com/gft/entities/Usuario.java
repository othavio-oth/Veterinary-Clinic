package com.gft.entities;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
=======
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToMany;
=======
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

<<<<<<< HEAD
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



=======

@Entity
@Table(name = "usuario")
public class Usuario implements  UserDetails, Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false)
	private String password;
	
	@ManyToOne(cascade= {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
	private Role role;
	
	
	
	public Usuario() {
	}
	public Usuario(UUID id, String username, String password, Role role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(this.role);
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
<<<<<<< HEAD



=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
<<<<<<< HEAD



=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
<<<<<<< HEAD



=======
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
<<<<<<< HEAD
=======
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRoles() {
		return role;
	}
	public void setRoles(Role roles) {
		this.role = roles;
	}
	
	
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de

}
