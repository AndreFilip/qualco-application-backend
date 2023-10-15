package com.filippatos.qualco.repositories;

import com.filippatos.qualco.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
}