package be.odisee.msPersoon;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import be.odisee.msPersoon.dao.PersoonRepository;
import be.odisee.msPersoon.domain.Persoon;

@SpringBootApplication
public class RisePersonenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RisePersonenApplication.class, args);
	}

}
