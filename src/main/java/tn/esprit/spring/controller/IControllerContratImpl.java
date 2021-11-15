package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.ITimesheetService;
import tn.esprit.spring.services.IContratService;


@Controller
public class IControllerContratImpl{

	@Autowired
	IContratService icontratservice;

	public int ajouterContrat(Contrat ssiiConsulting) {
		icontratservice.ajouterContrat(ssiiConsulting);
		return ssiiConsulting.getReference();
	}
	public void deleteContratById(int ContratId)
	{
		icontratservice.deleteContratById(ContratId);
	}
	public Contrat getContratById(int reference) {

		return icontratservice.getContratById(reference);
	}
	
	
	public List<Contrat> getAllContrat() {
		return icontratservice.retrieveAllContrat();
	}

}
