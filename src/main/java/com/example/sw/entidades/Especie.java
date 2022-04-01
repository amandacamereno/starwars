package com.example.sw.entidades;

import javax.persistence.*;

@Entity (name = "especie")
public class Especie {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idespecie")
    private Integer idespecie;
    @Column (name = "especie")
    private String especie;

    public Especie() {
    }

    public Especie(Integer idespecie, String especie) {
        this.idespecie = idespecie;
        this.especie = especie;
    }

    public Integer getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
