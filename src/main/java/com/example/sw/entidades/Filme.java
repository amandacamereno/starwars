package com.example.sw.entidades;

import javax.persistence.*;

@Entity (name = "filme")
public class Filme {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idfilme")
    private Integer id;
    @Column (name = "titulo")
    private String titulo;
    @Column (name = "episodio")
    private String episodio;
    @Column (name = "sinopse")
    private String sinopse;
    @Column (name = "produtor")
    private String produtor;
    @Column (name = "diretor")
    private String diretor;
    @Column (name = "datalancamento")
    private String dataLancamento;
    @Column (name = "criated")
    private String criated;
    @Column (name = "edited")
    private String edited;

    public Filme() {
    }

    public Filme(Integer id, String titulo, String episodio, String sinopse, String produtor, String diretor, String dataLancamento, String criated, String edited) {
        this.id = id;
        this.titulo = titulo;
        this.episodio = episodio;
        this.sinopse = sinopse;
        this.produtor = produtor;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
        this.criated = criated;
        this.edited = edited;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
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
