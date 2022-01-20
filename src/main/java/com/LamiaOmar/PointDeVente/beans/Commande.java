package com.LamiaOmar.PointDeVente.beans;

import javax.persistence.*;


@Entity
public class Commande {
    /*
    ** Attributs: id, date, idemployee
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String date;
    private Long employeID;

    public Commande() {
    }

    public Commande(long id) {
        this.id = id;
    }

    public Commande(long id, String date, Long employeID) {
        this.id = id;
        this.date = date;
        this.employeID = employeID;
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

    public Long getEmployeID() {
        return employeID;
    }

    public void setEmployeID(Long employeID) {
        this.employeID = employeID;
    }
}
