package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.Foyer_BI.entities.Etudiant;
import tn.esprit.foyer_bi.Foyer_BI.entities.Foyer;

import java.util.List;

public interface IfoyerService {
    Foyer addFoyer (Foyer foyer);

    void deleteFoyer (Long idFoyer);

    Foyer UpdateFoyer (Foyer foyer);

    List<Foyer> getAllFoyer ();
}
