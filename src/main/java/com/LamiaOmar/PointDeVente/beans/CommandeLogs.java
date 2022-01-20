package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;

@Entity
public class CommandeLogs {
    /*
     ** Attributs: id, idcommande, idproduit
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private long commandeID;
    private long produitID;



    public CommandeLogs() {
    }

    public CommandeLogs(long id) {
        this.id = id;
    }

    public CommandeLogs(long id, long commandeID, long produitID) {
        this.id = id;
        this.commandeID = commandeID;
        this.produitID = produitID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCommandeID() {
        return commandeID;
    }

    public void setCommandeID(long commandeID) {
        this.commandeID = commandeID;
    }

    public long getProduitID() {
        return produitID;
    }

    public void setProduitID(long produitID) {
        this.produitID = produitID;
    }
}
