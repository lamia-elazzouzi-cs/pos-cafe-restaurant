package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;

@Entity
public class Produit {
    /*
    ** Attributs: id, nom, prix, icone, categorie
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nom;
    private double prix;
    private String icone;

    private Long categorieID;


    public Produit() {
    }

    public Produit(long id, String nom, double prix, String icone, Long categorieID) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.icone = icone;
        this.categorieID = categorieID;
    }

    public Produit(long id) {
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public Long getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(Long categorieID) {
        this.categorieID = categorieID;
    }
}
