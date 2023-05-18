package be.odisee.demoplanner.dao;

import be.odisee.demoplanner.domain.Planning;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface PlanningRepository extends JpaRepository<Planning, Integer> {

}
