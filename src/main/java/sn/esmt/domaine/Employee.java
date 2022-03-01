package sn.esmt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employes")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private int salbase;
	
	public Employee() {
	
	}

	public Employee(int id, String nom, String prenom, int salbase) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salbase = salbase;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getSalbase() {
		return salbase;
	}

	public void setSalbase(int salbase) {
		this.salbase = salbase;
	}
	
	
}
