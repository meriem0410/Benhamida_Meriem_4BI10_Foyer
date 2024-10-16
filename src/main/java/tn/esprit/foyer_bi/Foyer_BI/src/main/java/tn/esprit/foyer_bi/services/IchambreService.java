package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.Foyer_BI.entities.Chambre;
import java.util.List;

public interface IchambreService {

    Chambre addChambre (Chambre chambre);

    void deleteChambre (Long idChambre);

    Chambre UpdateChambre (Chambre chambre);

    List<Chambre> getAllChambre ();


}
