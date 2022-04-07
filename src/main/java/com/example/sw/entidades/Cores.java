package com.example.sw.entidades;



import javax.persistence.*;

@Entity (name = "cores")
public class Cores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcor")
    private long id;
    @Column(name = "cores")
    private String cores;

    public Cores() {
    }

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
