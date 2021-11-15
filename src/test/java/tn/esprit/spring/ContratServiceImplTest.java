package tn.esprit.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IContratService;

import static org.junit.Assert.*;



@SpringBootTest

class ContratServiceImplTest {
          
	@Autowired
	IContratService ct ;
	
	
	
	/*@Test
   public void ajoutContratTest() throws ParseException{
		System.out.println("ici1");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("ici2");
		Date d = dateFormat.parse("1996-08-29");
		System.out.println("ici3");
		Contrat c = new Contrat(d,"nada",14);
		System.out.println("ici3");

		ct.ajouterContrat(c);
		System.out.println("ici4");

		assertNotNull(ct.ajouterContrat(c));
		System.out.println("ici5");

}
	/*@Test
	public void testRetrieveAllContrats() {
		List<Contrat> listContrats = ct.retrieveAllContrat();
		Assertions.assertEquals(0,listContrats.size());

		
		
	}*/
	
	//@Test
	//public void testAddContrat() throws ParseException {
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		/*Date d = dateFormat.parse("1997-04-26");
		Contrat c = new Contrat(d,"nada",14);
		Contrat  addedContrat = ct.addContrat(c);
		Assertions.assertEquals(c.getReference(),addedContrat.getReference());
		
		
		
	}*/
}