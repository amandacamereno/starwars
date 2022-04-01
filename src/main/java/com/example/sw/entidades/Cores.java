package com.example.sw.entidades;

public class Cores {
    private long id;
    private String cores;

    public Cores(long id, String cores) {
        this.id = id;
        this.cores = cores;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }
}
