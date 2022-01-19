package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employe {
    /*
    ** Attributs: id, nom, email, telephone, fonction
    ** Association:
    ** onetomany with commandes
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nom;
    private String email;
    private String telephone;
    private String fonction;

    @OneToMany
    private List<Commande> commandes;

    public Employe() {
    }

    public Employe(long id) {
        this.id = id;
    }

    public Employe(long id, String nom, String email, String telephone, String fonction) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.fonction = fonction;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
