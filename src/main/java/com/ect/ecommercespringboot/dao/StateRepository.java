package com.ect.ecommercespringboot.dao;

import com.ect.ecommercespringboot.entity.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "states", path = "states")
public interface StateRepository extends JpaRepository<States, Integer> {

    List<States> findByCountryCode(@Param("code") String code);
}
