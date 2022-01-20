package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {
    /*
    ** Attributs: id, nom, idAdmin
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nom;
    private long adminID;

    public Categorie() {
    }

    public Categorie(long id) {
        this.id = id;
    }

    public Categorie(long id, String nom, long adminID) {
        this.id = id;
        this.nom = nom;
        this.adminID = adminID;
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

    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }
}
