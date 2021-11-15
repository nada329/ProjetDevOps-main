package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class ContratServiceImpl implements IContratService {
	
	@Autowired
    ContratRepository ContratRepository;
	@Autowired
	DepartementRepository deptRepoistory;
	
	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);	

	
	
	public List<Contrat> retrieveAllContrat() {
		List<Contrat> Contrats  = null; 
		try {
	
			l.info("In method retrieveContrats  : ");
			Contrats = (List<Contrat>) ContratRepository.findAll();  
			l.debug("connexion a la base ok : ");
			for (Contrat  Contrat : Contrats) {
				l.debug(" Contrat:" +  Contrat.getReference());
			} 
               l.info("out of method retrieveAllContrats with success");
		    }
		catch (Exception e) {
               l.error("Out of method retrieveAllContrats with Errors :" + e); 
		}

		return Contrats ;
	}
	
	public void ajouterContrat(Contrat contrat) {
		ContratRepository.save(contrat);
		
	}
	
	public void deleteContratById(int Reference) {
		Contrat contrat = ContratRepository.findById(Reference).get();
		ContratRepository.delete(contrat);
	}


	@Override
	public Contrat getContratById(int reference) {
		Contrat contrat = ContratRepository.findById(reference).get();
		return contrat;
	}


}
