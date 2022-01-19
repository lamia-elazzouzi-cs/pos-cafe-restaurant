package com.LamiaOmar.PointDeVente.dao;

import com.LamiaOmar.PointDeVente.beans.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDAO extends JpaRepository<Admin, Long> {
}
