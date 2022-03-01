package sn.esmt.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sn.esmt.domaine.*;

@Repository
public class Acces {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void sauverEmploye(Employee employe)
	{
		em.persist(employe);
	}
	
	@Transactional
	public void modifierEmploye(Employee employe)
	{
		em.merge(employe);
	}
}
