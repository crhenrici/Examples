package com.prose.exampleserver2.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.*;
import com.prose.exampleserver2.model.*;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {

}