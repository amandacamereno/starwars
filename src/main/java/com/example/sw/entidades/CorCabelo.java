package com.example.sw.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity (name = "cor_cabelo")
public class CorCabelo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idcor_cabelo")
    private long id;
    @Column (name = "corcabelo")
    private String corCabelo;

    @ManyToOne
    @JoinColumn(name = "cores_idcor")
    private Cores cores;
    @ManyToOne
    @JoinColumn(name = "personagem_idpessoa")
    @JsonBackReference
    private Personagens personagensCabelo;
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
