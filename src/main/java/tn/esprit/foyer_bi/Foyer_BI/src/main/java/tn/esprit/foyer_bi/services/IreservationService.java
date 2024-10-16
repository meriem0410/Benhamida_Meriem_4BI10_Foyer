package tn.esprit.foyer_bi.Foyer_BI.src.main.java.tn.esprit.foyer_bi.services;

import tn.esprit.foyer_bi.Foyer_BI.entities.Etudiant;
import tn.esprit.foyer_bi.Foyer_BI.entities.Reservation;

import java.util.List;

public interface IreservationService {
    Reservation addReservation (Reservation reservation);

    void deleteReservation (Long idReservation);

    Reservation UpdateReservation (Reservation reservation);
    List<Reservation> getAllReservation ();
}
