package be.odisee.demoplanner.service;

import be.odisee.demoplanner.domain.*;
import be.odisee.demoplanner.utilities.RolNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

public interface DemoPlannerSessieService {


    public List<Datum> geefAlleDatums();

    public Datum zoekDatumMetId(int id);

    public Datum voegDatumToe(LocalDateTime naam, LocalDateTime adres, String status, Demo datums);

    Datum updateDatum(Datum datum);

     void verwijderDatumMetId(int id);

    public List<Planning> geefAllePlanningen();

    public Planning zoekPlanningMetId(int id);

    public Planning updatePlanning(Planning planning);

    public Planning voegPlanningToe(String status, int datum_id, int ambassadeur_id);

}