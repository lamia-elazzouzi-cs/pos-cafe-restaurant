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
    private Long commandeID;
    private Long produitID;

    public CommandeLogs(long id, Long commandeID, Long produitID) {
        this.id = id;
        this.commandeID = commandeID;
        this.produitID = produitID;
    }

    public CommandeLogs() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCommandeID() {
        return commandeID;
    }

    public void setCommandeID(Long commandeID) {
        this.commandeID = commandeID;
    }

    public Long getProduitID() {
        return produitID;
    }

    public void setProduitID(Long produitID) {
        this.produitID = produitID;
    }
}
