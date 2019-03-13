package com.prose.exampleserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import java.util.stream.*;

import com.prose.exampleserver2.db.*;
import com.prose.exampleserver2.model.*;

@SpringBootApplication
public class Exampleserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exampleserver2Application.class, args);
	}

	@Bean
	ApplicationRunner init(CarRepository repository) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
						"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
							Car car = new Car();
							car.setName(name);
							repository.save(car);
						});
						repository.findAll().forEach(System.out::println);
		};
	}

}
