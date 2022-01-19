package com.LamiaOmar.PointDeVente.dao;

import com.LamiaOmar.PointDeVente.beans.CommandeLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeLogsDAO extends JpaRepository<CommandeLogs, Long> {
}
