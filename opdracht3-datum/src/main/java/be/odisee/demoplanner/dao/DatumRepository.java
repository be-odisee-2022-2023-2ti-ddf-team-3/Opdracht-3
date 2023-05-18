package be.odisee.demoplanner.dao;

import be.odisee.demoplanner.domain.Datum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DatumRepository extends JpaRepository<Datum, Integer> {
}
