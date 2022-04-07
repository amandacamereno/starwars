package com.example.sw.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name =  "cor_olhos")
public class CorOlhos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcor_olhos")
    private Integer idcorolhos;
    @Column(name = "corolhos")
    private String corolhos;

    @ManyToOne
    @JoinColumn(name = "cores_idcor")
    private Cores cores;
    @ManyToOne
    @JoinColumn(name = "cores_idpessoa")
    @JsonBackReference
    private Personagens personagensOlhos;
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

