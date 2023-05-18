package be.odisee.msPersoon.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import be.odisee.msPersoon.domain.Persoon;

@RepositoryRestResource
public interface PersoonRepository extends JpaRepository<Persoon, Integer> {
	Persoon findByEmailadres(String email);

}
