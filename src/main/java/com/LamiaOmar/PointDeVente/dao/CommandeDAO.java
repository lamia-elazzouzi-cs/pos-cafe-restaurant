package com.LamiaOmar.PointDeVente.dao;

import com.LamiaOmar.PointDeVente.beans.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDAO extends JpaRepository<Commande, Long> {
}
