package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.Foyer_BI.entities.Bloc;
import tn.esprit.foyer_bi.Foyer_BI.entities.Chambre;

import java.util.List;

public interface IblocService {
    Bloc addBloc (Bloc bloc);

    void deleteBloc (Long idBloc);

    Bloc UpdateChambre (Bloc bloc);

    List<Bloc> getAllBloc ();

}
