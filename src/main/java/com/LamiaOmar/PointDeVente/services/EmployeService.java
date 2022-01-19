package com.LamiaOmar.PointDeVente.services;

import com.LamiaOmar.PointDeVente.beans.Employe;
import com.LamiaOmar.PointDeVente.dao.EmployeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    private EmployeDAO employe_dao;

    public Employe save(Employe e){
        return employe_dao.save(e);
    }

    public Employe findById(long along){
        return employe_dao.findById(along).get();
    }

    public void DeleteById(Long along){
        employe_dao.deleteById(along);
    }

    public List<Employe> findAll(){
        return employe_dao.findAll();

    }

    public Employe update(long id, Employe e){
        Employe a1 = new Employe();
        a1 = this.findById(id);
        a1.setFonction(e.getFonction());
        a1.setTelephone(e.getTelephone());
        a1.setEmail(e.getEmail());
        a1.setNom(e.getNom());
        a1.setCommandes(e.getCommandes());

        this.save(a1);
        return a1;
    }
}
