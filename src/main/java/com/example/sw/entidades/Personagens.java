package com.example.sw.entidades;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idespécie")
    private Especie especie;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idgenero")
    private Genero genero;
    @OneToMany(mappedBy = "personagensPele")
    @JsonManagedReference
    private List<CorPele> corPeleList;
    @OneToMany(mappedBy = "personagensCabelo")
    @JsonManagedReference
    private List<CorCabelo> corCabeloList;
    @OneToMany(mappedBy = "personagensOlhos")
    @JsonManagedReference
    private List<CorOlhos> corOlhosList;

    public Personagens (){};

    public Personagens(Integer id, String nome, Double altura, Double peso, String data_aniversario, String criated,
                       String edited, Genero genero, Especie especie, List<CorPele> corPeleList,
                       List<CorCabelo> corCabeloList, List<CorOlhos>corOlhosList) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.data_aniversario = data_aniversario;
        this.criated = criated;
        this.edited = edited;
        this.genero = genero;
        this.especie = especie;
        this.corPeleList = corPeleList;
        this.corCabeloList = corCabeloList;
        this.corOlhosList = corOlhosList;

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

    public Especie getEspecie() {return especie;}

    public void setEspecie(Especie especie) {this.especie = especie;}

    public Genero getGenero() {return genero;}

    public void setGenero(Genero genero) {this.genero = genero;}

    public List<CorPele> getCorPeleList() {return corPeleList;}

    public void setCorPeleList(List<CorPele> corPeleList) {this.corPeleList = corPeleList;}

    public List<CorCabelo> getCorCabeloList() {return corCabeloList;}

    public void setCorCabeloList(List<CorCabelo> corCabeloList) {this.corCabeloList = corCabeloList;}

    public List<CorOlhos> getCorOlhosList() {return corOlhosList;}

    public void setCorOlhosList(List<CorOlhos> corOlhosList) {this.corOlhosList = corOlhosList;}
}
