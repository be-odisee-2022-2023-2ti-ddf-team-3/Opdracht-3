package be.odisee.rise.service;

import be.odisee.rise.domain.Demo;

import java.util.List;

public interface DemoService {

	public List<Demo> geefAlleDemos();

	public Demo zoekDemoMetId(int id);
	public Demo voegDemoToe(String naam, String adres, String status);

	Demo updateDemo(Demo demo);

	void verwijderDemoMetId(int id);

}
