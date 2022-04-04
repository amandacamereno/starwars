package com.example.sw.entidades;

import javax.persistence.*;

@Entity(name =  "corolhos")
public class CorOlhos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcorolhos")
    private Integer idcorolhos;
    @Column(name = "corolhos")
    private String corolhos;

    public CorOlhos() {
    }

    public CorOlhos(Integer idcorolhos, String corolhos) {
        this.idcorolhos = idcorolhos;
        this.corolhos = corolhos;
    }

    public Integer getIdcorolhos() {
        return idcorolhos;
    }

    public void setIdcorolhos(Integer idcorolhos) {
        this.idcorolhos = idcorolhos;
    }

    public String getCorolhos() {
        return corolhos;
    }

    public void setCorolhos(String corolhos) {
        this.corolhos = corolhos;
    }
}

