package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;

@Entity
public class Admin {
    /*
    ** Attributs: id, nom, email, mdp
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nom;
    private String email;
    private String mdp;


    public Admin() {
    }

    public Admin(long id, String nom, String email, String mdp) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
    }

    public Admin(long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


}
