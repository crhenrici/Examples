package com.prose.exampleserver2.model;

import lombok.*;

import javax.persistence.*;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Car {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
    
}