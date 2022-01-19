package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;

@Entity
public class Produit {
    /*
    ** Attributs: id, nom, prix, icone, objetcategorie
    ** Association:
    ** manytoone with categorie
    ** manytoone with commande
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nom;
    private double prix;
    private String icone;

    @ManyToOne
    @JoinColumn(name="id_categorie")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name="id_commande")
    private Commande commande;

    public Produit() {
    }

    public Produit(long id) {
        this.id = id;
    }

    public Produit(long id, String nom, double prix, String icone, Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.icone = icone;
        this.categorie = categorie;
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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
