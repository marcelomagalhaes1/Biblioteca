/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.util.Date;
import java.util.List;

/**
 *
 * @author valdi
 */
public abstract class Publicacao{
    
    private String titulo;
    private Date dataPublicacao;
    private List<Publicacao> referencias;
    private List<Autor> autores;

    public Publicacao(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.referencias = referencias;
        this.autores = autores;
    }
    public abstract double getValorMulta();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Publicacao> referencias) {
        this.referencias = referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}   
