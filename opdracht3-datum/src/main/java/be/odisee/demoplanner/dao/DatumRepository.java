package be.odisee.demoplanner.dao;

import be.odisee.demoplanner.domain.Datum;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface DatumRepository extends JpaRepository<Datum, Integer> {
}
