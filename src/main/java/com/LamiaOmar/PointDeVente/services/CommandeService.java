package com.LamiaOmar.PointDeVente.services;

import com.LamiaOmar.PointDeVente.beans.Commande;
import com.LamiaOmar.PointDeVente.dao.CommandeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeDAO commande_dao;

    public Commande save(Commande c){
        return commande_dao.save(c);
    }

    public Commande findById(long along){
        return commande_dao.findById(along).get();
    }

    public void DeleteById(Long along){
        commande_dao.deleteById(along);
    }

    public List<Commande> findAll(){
        return commande_dao.findAll();

    }

    public Commande update(long id, Commande c){
        Commande c1 = new Commande();
        c1 = this.findById(id);
        c1.setDate(c.getDate());
        c1.setEmployeID(c.getEmployeID());

        this.save(c1);
        return c1;
    }



}
