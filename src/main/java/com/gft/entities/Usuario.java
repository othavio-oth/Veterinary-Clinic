package com.gft.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


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
	
	

}
