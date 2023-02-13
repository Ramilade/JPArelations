package com.example.jparelations.repository;

import com.example.jparelations.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
}
