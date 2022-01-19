package com.LamiaOmar.PointDeVente.services;


import com.LamiaOmar.PointDeVente.beans.CommandeLogs;
import com.LamiaOmar.PointDeVente.dao.CommandeLogsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeLogsService {
    @Autowired
    private CommandeLogsDAO logs_dao;

    public CommandeLogs save(CommandeLogs c){
        return logs_dao.save(c);
    }

    public CommandeLogs findById(long along){
        return logs_dao.findById(along).get();
    }

    public void DeleteById(Long along){
        logs_dao.deleteById(along);
    }

    public List<CommandeLogs> findAll(){
        return logs_dao.findAll();

    }

    public CommandeLogs update(long id, CommandeLogs cl){
        CommandeLogs c1 = new CommandeLogs();
        c1 = this.findById(id);
        c1.setCommandeID(cl.getCommandeID());
        c1.setProduitID(cl.getProduitID());

        this.save(c1);
        return c1;
    }
}
