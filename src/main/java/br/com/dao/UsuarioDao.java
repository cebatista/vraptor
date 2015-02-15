package br.com.dao;

import javax.inject.Inject;

import org.hibernate.Session;

import br.com.model.Usuario;


public class UsuarioDao {
	
	@Inject
	private Session session;
	
	public UsuarioDao(){}
	
	public void salvaUsuario(Usuario usu){
		System.out.println("passou");
		session.save(usu);
	}

}
