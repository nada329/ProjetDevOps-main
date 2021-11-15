package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;

public interface IContratService {

	List<Contrat> retrieveAllContrat();
	void ajouterContrat(Contrat contrat);
	void deleteContratById(int Reference);
	Contrat getContratById(int reference);

}
