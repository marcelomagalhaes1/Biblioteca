/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.util.Date;

/**
 *
 * @author valdi
 */
public class Emprestimo {

    private Publicacao publicacao;
    private Usuario usuario;
    private Date dataEmprestimo;
    private int numeroRenovacoes;

    public Emprestimo(Publicacao publicacao, Usuario usuario, Date dataEmprestimo) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.numeroRenovacoes = 0;
    }

    public void renovarEmprestimo() {
        this.numeroRenovacoes++;
    }

    public double calcularMulta() {
        if (numeroRenovacoes > 3) {
            return (numeroRenovacoes - 3) * publicacao.getValorMulta();
        }
        return 0;
    }

    // Getters e setters
    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getNumeroRenovacoes() {
        return numeroRenovacoes;
    }

    public void setNumeroRenovacoes(int numeroRenovacoes) {
        this.numeroRenovacoes = numeroRenovacoes;
        }
    }