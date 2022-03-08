package sn.esmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.esmt.domaine.*;
import sn.esmt.dao.*;

@SpringBootApplication
public class DemoJ2EeApplication implements CommandLineRunner{
	
	@Autowired
	private Acces bd;

	public static void main(String[] args) {
		SpringApplication.run(DemoJ2EeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/**	Employee emp1 = new Employee();
		emp1.setNom("Diop");
		emp1.setPrenom("Moussa");
		emp1.setSalbase(30000);
		bd.sauverEmploye(emp1);
		
		Employee emp2 = new Employee("Diallo","Ali", 200000);
		bd.sauverEmploye(emp2);	**/
		
		Employee emp = bd.rechercherEmploye(1);
		if(emp==null)
			System.out.println("id inexistant !!!");
		else
		{
			System.out.println("Id :"+emp.getId());
			System.out.println("Id :"+emp.getNom());
			System.out.println("Id :"+emp.getPrenom());
			System.out.println("Id :"+emp.getSalbase());
		}
		
		// Affichage
		List<Employee> liste = bd.afficherEmployes();
		for(Employee x : liste)
		{
			System.out.println("-------------------------");
			System.out.println("Id :"+x.getId());
			System.out.println("Nom :"+x.getNom());
			System.out.println("Prenom :"+x.getPrenom());
			System.out.println("Salaire de Base :"+x.getSalbase());
		}
		System.out.println("-------------------------");
		
		//Modifier
		Employee y = bd.rechercherEmploye(1);
		if (y!=null)
		{
			y.setPrenom("Jean");
			y.setSalbase(350000);
			bd.modifierEmploye(y);
		}
		
		//Suppression
		
	}

}
