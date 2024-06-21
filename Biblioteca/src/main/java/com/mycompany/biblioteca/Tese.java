/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.util.List;
import java.util.Date;
/**
 *
 * @author valdi
 */
public class Tese extends Publicacao {
    
    private int numeroPaginas;
    private String resumo;
    private Date dataDefesa;
    private String instituicao;
    
    public Tese(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores, int numeroPaginas, String resumo, Date dataDefesa, String instituicao) {
        super(titulo, dataPublicacao, referencias, autores);
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
}

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public double getValorMulta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}