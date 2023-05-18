package be.odisee.msPersoon.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import be.odisee.msPersoon.dao.PersoonRepository;
import be.odisee.msPersoon.domain.Persoon;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersoonServiceImpl implements PersoonService {

	@Autowired
	private PersoonRepository persoonRepository = null;

	// public DemoPlannerSessieServiceImpl(){}

	public List<Persoon> geefAllePersonen() {
		return persoonRepository.findAll();
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	public Persoon zoekPersoonMetId(int id){
		Persoon persoon;

		Optional<Persoon> optionalPersoon = persoonRepository.findById(id);
		if ( optionalPersoon.isPresent() ) persoon = optionalPersoon.get();
		else persoon = null; // in dat geval hebben we geen persoon met dat id gevonden
		return persoon;
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	@Override
	public Persoon zoekPersoonMetEmail(String email) {
		return persoonRepository.findByEmailadres(email);
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	public Persoon voegPersoonToe(String voornaam, String familienaam, String emailadres, String paswoord) {

		return persoonRepository.save( createPersoon(voornaam,familienaam,emailadres,paswoord) );
	}

	private Persoon createPersoon( String voornaam, String familienaam, String emailadres, String paswoord) {

		return new Persoon( voornaam, familienaam, emailadres,paswoord);
	}

	@Override
	public Persoon updatePersoon(Persoon persoon) {
		return persoonRepository.save(persoon);
	}

	@Override
	public void verwijderPersoonMetId(int id) {
		persoonRepository.delete(zoekPersoonMetId(id));
	}


}
