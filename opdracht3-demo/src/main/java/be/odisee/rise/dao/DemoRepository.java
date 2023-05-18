package be.odisee.rise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import be.odisee.rise.domain.Demo;

@RepositoryRestResource
public interface DemoRepository extends JpaRepository<Demo, Integer> {

}
