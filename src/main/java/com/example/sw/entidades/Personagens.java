package com.example.sw.entidades;

import javax.persistence.*;

@Entity(name = "personagem")
public class Personagens  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpessoa")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "altura")
    private Double altura;
    @Column(name = "peso")
    private Double peso;
    @Column(name = "data-aniversario")
    private String data_aniversario;
    @Column(name = "criated")
    private String criated;
    @Column(name = "edited")
    private String edited;

    public Personagens (){};

    public Personagens(Integer id, String nome, Double altura, Double peso, String data_aniversario, String criated, String edited) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.data_aniversario = data_aniversario;
        this.criated = criated;
        this.edited = edited;

    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getData_aniversario() {
        return data_aniversario;
    }

    public void setData_aniversario(String data_aniversario) {
        this.data_aniversario = data_aniversario;
    }

    public String getCriated() {
        return criated;
    }

    public void setCriated(String criated) {
        this.criated = criated;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

}
