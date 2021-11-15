package tn.esprit.spring;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.jupiter.api.Test;  //remouve jupiter and replace with Junit********************
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.services.IEntrepriseService;

import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetApplicationTests {
	
	private static final Logger l=LogManager.getLogger(TimesheetApplicationTests.class);
	@Autowired
	IContratService ct ;
	
	@Autowired
	IEntrepriseService entrepSrevice;

	//load context
	@Test
	public void contextLoads() {
	}
	
	/*********   TEST methods EntrepriseServices   *******/
	
	@Test(timeout = 5000)
	public void ajoutEntrTest(){
	
		
			Entreprise e=new Entreprise("telnet","Sfax");
			entrepSrevice.ajouterEntreprise(e);
			
			assertNotNull(entrepSrevice.ajouterEntreprise(e));
	}
	
	
	/*@Test
	   public void ajoutContratTest1() throws ParseException{
			System.out.println("ici1");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
			System.out.println("ici2");
			Date d = dateFormat.parse("1996-08-29");
			System.out.println("ici3");
			Contrat c = new Contrat(d,"nada",14f);
			//System.out.println("ici3");

			ct.ajouterContrat(c);
			//System.out.println("ici4");

			//assertNotNull(ct.ajouterContrat(c));
			System.out.println("ici5");

	}*/
	
	
	public void ajoutContratTest(){
		
		
		Entreprise e=new Entreprise("telnet","Sfax");
		entrepSrevice.ajouterEntreprise(e);
		
		assertNotNull(entrepSrevice.ajouterEntreprise(e));
}
	
	
	//@Test(timeout = 5000)
	//public void ajoutDepTest(){
	
		//test pour ajout Dep
			//Departement d=new Departement("Informatique");
			//entrepSrevice.ajouterDepartement(d);
			
		//	assertNotNull(entrepSrevice.ajouterDepartement(d));
	//}
	
	//@Test(timeout = 5000)
//	public void retriveEntrTest(){
	
		//test pour récuper  entreprise
	
	//	Entreprise e=entrepSrevice.getEntrepriseById(2);
			
			//assertNotNull(e.getName());
		//	l.info("get Enreprise:" + e);
	//}
	
	//@Test(timeout = 5000)
	//public void affecterDepartementAEntrTest(){
	
        //entrepSrevice.affecterDepartementAEntreprise(1,1);
		
		
	//}
	
	
//	@Test(timeout = 5000)
//	public void getAllDepartementsNamesByEntrTest(){
//	List<String> lnoms=entrepSrevice.getAllDepartementsNamesByEntreprise(1);
//	
//	assertThat(lnoms).size().isGreaterThan(0);
//	}
	
	
	
//	@Test(timeout = 5000)
//	public void delteEntreTest(){
//		entrepSrevice.deleteEntrepriseById(1);
//		
//		assertNull(entrepSrevice.getEntrepriseById(1));
//	}
//	
//	@Test(timeout = 5000)
//	public void delteDepTest(){
//		entrepSrevice.deleteDepartementById(1);
//		
//		
//	}
	

}
