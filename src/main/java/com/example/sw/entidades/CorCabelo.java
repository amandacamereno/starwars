package com.example.sw.entidades;

public class CorCabelo {
    private long id;
    private String corCabelo;

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
