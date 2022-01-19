package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commande {
    /*
    ** Attributs: id, date, idemployee, liste produits
    ** Association:
    ** onetomany with produits
    ** manytoone with employe
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String date;

    @ManyToOne
    private Employe employe;

    @OneToMany
    private List<Produit> produits;

    public Commande() {
    }

    public Commande(long id) {
        this.id = id;
    }

    public Commande(long id, String date, Employe employe, List<Produit> produits) {
        this.id = id;
        this.date = date;
        this.employe = employe;
        this.produits = produits;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
