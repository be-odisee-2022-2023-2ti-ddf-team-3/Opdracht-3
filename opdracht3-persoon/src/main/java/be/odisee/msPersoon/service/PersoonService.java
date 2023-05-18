package be.odisee.msPersoon.service;

import be.odisee.msPersoon.domain.Persoon;

import java.util.List;

public interface PersoonService {


	public List<Persoon> geefAllePersonen();

	public Persoon voegPersoonToe(String voornaam, String familienaam, String emailadres, String paswoord);

	public Persoon zoekPersoonMetId(int id);

	public Persoon zoekPersoonMetEmail(String email);
	public Persoon updatePersoon(Persoon persoon);

	public void verwijderPersoonMetId(int id);

}
