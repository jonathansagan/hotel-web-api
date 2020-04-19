package dev.hotel.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hotel.entite.Chambre;

/**
 * Donne l'accès à la table Chambre via JPA
 * 
 * @author Jonathan
 *
 */
public interface ChambreRepository extends JpaRepository<Chambre, UUID> {

}
