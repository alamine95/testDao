package sn.esmt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	@Transactional
	public Employee rechercherEmploye(int id) {
		Employee emp=null;
		emp=em.find(Employee.class, id);
		return emp;
	}
	@Transactional
	public void supprimerEmploye(Employee emp)
	{
		if(emp!=null)
			em.remove(emp);
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Employee> afficherEmployes()
	{
		List<Employee> liste =null;
		Query q=em.createQuery("select x from Employee x");
		liste = (List<Employee>)q.getResultList();
		return liste;
	}
}
