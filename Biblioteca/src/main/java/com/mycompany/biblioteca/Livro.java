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
public class Livro extends Publicacao {
    private int numeroEdicao;
    private String nomeEditora;
    private String isbn;
    private final double valorMulta;

    public Livro(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores, int numeroEdicao, String nomeEditora, String isbn, double valorMulta) {
        super(titulo, dataPublicacao, referencias, autores);
        this.numeroEdicao = numeroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
        this.valorMulta = valorMulta;
    }

    @Override
    public double getValorMulta() {
        return valorMulta;
    }

    // Getters e setters
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}