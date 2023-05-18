package be.odisee.demoplanner.dao;

import be.odisee.demoplanner.domain.Planning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlanningRepository extends JpaRepository<Planning, Integer> {

}
