package dev.hotel.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hotel.entite.Reservation;

/**
 * Repository donnant accès à la table Réservation via JPA
 * 
 * @author Jonathan
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

}