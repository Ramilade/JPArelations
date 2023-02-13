package com.example.jparelations.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String zipCode;
    private String mayour;
    private String schools;

    public Town(String name, String zipCode, String mayour, String schools) {
        this.name = name;
        this.zipCode = zipCode;
        this.mayour = mayour;
        this.schools = schools;
    }
}
