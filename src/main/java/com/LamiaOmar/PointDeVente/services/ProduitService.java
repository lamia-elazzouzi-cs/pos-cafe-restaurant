package com.LamiaOmar.PointDeVente.services;

import com.LamiaOmar.PointDeVente.beans.Produit;
import com.LamiaOmar.PointDeVente.dao.ProduitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDAO produit_dao;

    public Produit save(Produit p){
        return produit_dao.save(p);
    }

    public Produit findById(long along){
        return produit_dao.findById(along).get();
    }

    public void DeleteById(Long along){
        produit_dao.deleteById(along);
    }

    public List<Produit> findAll(){
        return produit_dao.findAll();

    }

    public Produit update(long id, Produit p){
        Produit pp = new Produit();
        pp = this.findById(id);
        pp.setCategorie(p.getCategorie());
        pp.setIcone(p.getIcone());
        pp.setNom(p.getNom());
        pp.setPrix(p.getPrix());

        this.save(pp);
        return pp;
    }
}
