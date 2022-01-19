package com.LamiaOmar.PointDeVente.dao;

import com.LamiaOmar.PointDeVente.beans.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDAO extends JpaRepository<Categorie, Long> {
}
