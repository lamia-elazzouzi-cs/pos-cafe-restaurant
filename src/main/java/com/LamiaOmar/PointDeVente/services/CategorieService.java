package com.LamiaOmar.PointDeVente.services;

import com.LamiaOmar.PointDeVente.beans.Categorie;
import com.LamiaOmar.PointDeVente.dao.CategorieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieDAO categorie_dao;

    public Categorie save(Categorie c){
        return categorie_dao.save(c);
    }

    public Categorie findById(long along){
        return categorie_dao.findById(along).get();
    }

    public void DeleteById(Long along){
        categorie_dao.deleteById(along);
    }

    public List<Categorie> findAll(){
        return categorie_dao.findAll();
    }

    public Categorie update(long id, Categorie c){
        Categorie c1 = new Categorie();
        c1 = this.findById(id);

        c1.setNom(c.getNom());
        c1.setAdmin(c.getAdmin());


        this.save(c1);
        return c1;
    }
}
