package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {
    /*
    ** Attributs: id, nom, idAdmin
    ** Association:
    ** manytoone with admin
    ** onetomany with produits
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nom;

    @ManyToOne
    @JoinColumn(name="id_admin")
    private Admin admin;


    @OneToMany
    private List<Produit> produits;


    // standard constructor, getter, setter

    public Categorie() {
    }

    public Categorie(long id, String nom, Admin admin) {
        this.id = id;
        this.nom = nom;
        this.admin = admin;
    }

    public Categorie(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
