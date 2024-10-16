package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import tn.esprit.foyer_bi.Foyer_BI.entities.Chambre;
import java.util.List;
@AllArgsConstructor
public class chambreServiceImpl implements IchambreService{

   // chambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return null ;//chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
     //chambreRepository.deleteById(idchambre);
    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return null ;// return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
     return null ; // return chambreRepository.findAll();
    }
}
