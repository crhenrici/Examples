package com.prose.exampleserver2.controllers; 
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.prose.exampleserver2.db.*;
import com.prose.exampleserver2.model.*;

class CoolCarController {
    private CarRepository repository;

    public CoolCarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cool-cars")
    public Collection<Car> coolCars() {
        return repository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") &&
                !car.getName().equals("Triumph Stag") &&
                !car.getName().equals("Ford Pinto") &&
                !car.getName().equals("Yugo GV");
    }
}

