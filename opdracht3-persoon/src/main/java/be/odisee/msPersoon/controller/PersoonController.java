package be.odisee.msPersoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.msPersoon.domain.Persoon;
import be.odisee.msPersoon.service.PersoonService;

@RestController
public class PersoonController {
	
	@Autowired
	PersoonService persoonService;

}
