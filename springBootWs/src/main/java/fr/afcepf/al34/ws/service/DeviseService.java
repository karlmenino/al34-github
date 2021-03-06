package fr.afcepf.al34.ws.service;

import java.util.List;

import fr.afcepf.al34.ws.entity.Devise;
import fr.afcepf.al34.ws.exception.MyEntityNotFoundException;

public interface DeviseService {
	
	Devise rechercherDeviseParCode(String code);
	List<Devise> rechercherDeviseParChangeMini(Double change);
	
	Devise sauvegarderDevise(Devise d);
	void supprimerDevise(String code) throws MyEntityNotFoundException;
    //...
	List<Devise> rechercherToutesDevises();
}
