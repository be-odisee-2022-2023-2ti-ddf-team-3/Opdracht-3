package be.odisee.rise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.odisee.rise.domain.Demo;
import be.odisee.rise.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
}
