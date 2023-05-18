package be.odisee.demoplanner.service;

import be.odisee.demoplanner.dao.*;
import be.odisee.demoplanner.domain.*;
import be.odisee.demoplanner.utilities.RolNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class DemoPlannerSessieServiceImpl implements DemoPlannerSessieService {

    @Autowired
    private DatumRepository datumRepository = null;
    public List<Datum> geefAlleDatums() {
        return datumRepository.findAll();
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Datum zoekDatumMetId(int id){
        Datum datum;

        Optional<Datum> optionalDatum = datumRepository.findById(id);
        if ( optionalDatum.isPresent() ) datum = optionalDatum.get();
        else datum = null; // in dat geval hebben we geen persoon met dat id gevonden
        return datum;
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Datum voegDatumToe( LocalDateTime start, LocalDateTime einde, String status ) {

        return datumRepository.save( createDatum( start, einde, status ));
    }

    private Datum createDatum( LocalDateTime start, LocalDateTime einde, String status) {

        return new Datum( start, einde, status );
    }

    @Override
    public Datum updateDatum(Datum datum) {
        return datumRepository.save(datum);
    }

    @Override
    public void verwijderDatumMetId(int id) {
        datumRepository.delete(zoekDatumMetId(id));
    }
    @Autowired
    private PlanningRepository planningRepository;
    public List<Planning> geefAllePlanningen() {
        return planningRepository.findAll();
    }
    @Override
    public Planning updatePlanning(Planning planning) {
        return planningRepository.save(planning);
    }
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Planning zoekPlanningMetId(int id){
        Planning planning;

        Optional<Planning> optionalPlanning = planningRepository.findById(id);
        if ( optionalPlanning.isPresent() ) planning = optionalPlanning.get();
        else planning = null; // in dat geval hebben we geen plannning met dat id gevonden
        return planning;
    }
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Planning voegPlanningToe(String status, int datum_id, int ambassadeur_id) {

        return planningRepository.save( createPlanning(status, datum_id, ambassadeur_id) );
    }

    private Planning createPlanning( String status,int datum_id, int ambassadeur_id) {

        return new Planning(status, datum_id, ambassadeur_id );
    }

}