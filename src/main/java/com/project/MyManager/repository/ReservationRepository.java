package com.project.MyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
