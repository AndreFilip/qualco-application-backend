package com.filippatos.qualco.repositories;

import com.filippatos.qualco.entities.RegionArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionAreaRepository extends JpaRepository<RegionArea, String> {
}