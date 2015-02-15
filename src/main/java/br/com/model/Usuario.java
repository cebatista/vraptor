package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue
	@Getter @Setter Integer codUsuario;
	@Getter @Setter String login;
	@Getter @Setter String senha;
	
}
