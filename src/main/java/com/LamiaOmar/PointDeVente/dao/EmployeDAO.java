package com.LamiaOmar.PointDeVente.dao;

import com.LamiaOmar.PointDeVente.beans.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeDAO extends JpaRepository<Employe, Long> {
}
