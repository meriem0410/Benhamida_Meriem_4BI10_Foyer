package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.foyer_bi.Foyer_BI.entities.Chambre;
import tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services.IchambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")

public class ChambreController {
    IchambreService chambreService;
    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.getAllChambre();
        return listChambres;
    }
    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public void deleteById(@PathVariable("chambre-id") Long chId) {
        chambreService.deleteChambre(chId);
        //return chambre;
    }


}
