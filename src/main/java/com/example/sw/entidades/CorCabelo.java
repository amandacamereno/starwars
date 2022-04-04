package com.example.sw.entidades;

import javax.persistence.*;

@Entity (name = "corcabelo")
public class CorCabelo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idcorcabelo")
    private long id;
    @Column (name = "corcabelo")
    private String corCabelo;

    public CorCabelo() {
    }

    public CorCabelo(long id, String corCabelo) {
        this.id = id;
        this.corCabelo = corCabelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }
}
