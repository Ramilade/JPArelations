package com.example.jparelations.repository;

import com.example.jparelations.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TownRepository extends JpaRepository<Town, Integer> {
}
