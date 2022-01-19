package com.LamiaOmar.PointDeVente.dao;

import com.LamiaOmar.PointDeVente.beans.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitDAO extends JpaRepository<Produit, Long> {
}
