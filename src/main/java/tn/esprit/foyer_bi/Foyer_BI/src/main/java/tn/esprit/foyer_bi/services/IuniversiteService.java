package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.Foyer_BI.entities.Etudiant;
import tn.esprit.foyer_bi.Foyer_BI.entities.Reservation;
import tn.esprit.foyer_bi.Foyer_BI.entities.Universite;

import java.util.List;

public interface IuniversiteService {   Etudiant addEtudiant (Etudiant etudiant);

    Universite addUniversite (Universite universite);
    void deleteUniversite (Long idUniversite);

    Universite UpdateUniversite (Universite universite);

    List<Universite> getAllUniversite ();

}
