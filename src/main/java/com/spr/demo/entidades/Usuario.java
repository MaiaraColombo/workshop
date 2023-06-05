package com.spr.demo.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String email;
	private String phone;
	private String senha;
	
	
	public Usuario() {
		
	}

	public Usuario(long id, String name, String email, String phone, String senha) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
	
	
	
}
