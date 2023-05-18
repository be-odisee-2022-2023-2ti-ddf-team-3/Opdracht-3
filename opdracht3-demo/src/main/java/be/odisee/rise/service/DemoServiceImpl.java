package be.odisee.rise.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import be.odisee.rise.dao.DemoRepository;
import be.odisee.rise.domain.Demo;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoRepository demoRepository;
	public List<Demo> geefAlleDemos() {
		return demoRepository.findAll();
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	public Demo zoekDemoMetId(int id){
		Demo demo;

		Optional<Demo> optionalDemo = demoRepository.findById(id);
		if ( optionalDemo.isPresent() ) demo = optionalDemo.get();
		else demo = null; // in dat geval hebben we geen persoon met dat id gevonden
		return demo;
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	public Demo voegDemoToe(String naam, String adres, String status) {

		return demoRepository.save( createDemo(naam,adres,status) );
	}

	private Demo createDemo( String naam, String adres, String status) {

		return new Demo( naam, adres,status );
	}

	@Override
	public Demo updateDemo(Demo demo) {
		return demoRepository.save(demo);
	}

	@Override
	public void verwijderDemoMetId(int id) {
		demoRepository.delete(zoekDemoMetId(id));
	}

}
