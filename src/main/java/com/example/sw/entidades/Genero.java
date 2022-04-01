package com.example.sw.entidades;

import javax.persistence.*;

@Entity (name = "genero")
public class Genero {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idgenero")
    private Integer idgenero;
    @Column (name = "genero")
    private String genero;

    public Genero() {
    }

    public Genero(Integer idgenero, String genero) {
        this.idgenero = idgenero;
        this.genero = genero;
    }

    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
