package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.Foyer_BI.entities.Chambre;
import tn.esprit.foyer_bi.Foyer_BI.entities.Etudiant;

import java.util.List;

public interface IetudiantService {
    Etudiant addEtudiant (Etudiant etudiant);

    void deleteEtudiant (Long idEtudiant);

    Etudiant UpdateEtudiant (Etudiant etudiant);

    List<Etudiant> getAllEtudiant ();
}
