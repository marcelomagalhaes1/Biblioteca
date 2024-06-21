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
public class Artigo extends Publicacao {
    private String resumo;
    private final double valorMulta;

    public Artigo(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores, String resumo, double valorMulta) {
        super(titulo, dataPublicacao, referencias, autores);
        this.resumo = resumo;
        this.valorMulta = valorMulta;
    }

    @Override
    public double getValorMulta() {
        return valorMulta;
    }

    // Getters e setters
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
