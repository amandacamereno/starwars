package com.example.sw.entidades;

import javax.persistence.*;

@Entity (name =  "corpele")
public class CorPele {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idcorpele")
    private Integer idcorpele;
    @Column (name = "corpele")
    private String corpele;

    public CorPele() {
    }

    public CorPele(Integer idcorpele, String corpele) {
        this.idcorpele = idcorpele;
        this.corpele = corpele;
    }

    public Integer getIdcorpele() {
        return idcorpele;
    }

    public void setIdcorpele(Integer idcorpele) {
        this.idcorpele = idcorpele;
    }

    public String getCorpele() {
        return corpele;
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }
}
