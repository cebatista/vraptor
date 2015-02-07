package br.com.dao;

import javax.inject.Inject;
import org.hibernate.Session;


public class ExemploDaoPlugHibernate {
	
	@Inject
	private Session session;

	/*
	 * Obrigatório para injecao de dependencia
	 */
	public ExemploDaoPlugHibernate() {}

	
}
