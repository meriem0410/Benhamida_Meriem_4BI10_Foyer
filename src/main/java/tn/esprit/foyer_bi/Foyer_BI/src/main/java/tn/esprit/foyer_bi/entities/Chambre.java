package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.foyer_bi.Foyer_BI.entities.TypeChambre;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING) //string(tatl3lik en lettre) ordinal (0,1,2)
    private TypeChambre typeC;


}
