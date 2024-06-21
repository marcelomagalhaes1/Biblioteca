/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author valdi
 */
public class Usuario {
    
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Emprestimo emprestimoAtual;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimoAtual = null;
    }

    public boolean podePegarEmprestimo() {
        return emprestimoAtual == null;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimoAtual = emprestimo;
    }

    public void removerEmprestimo() {
        this.emprestimoAtual = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    Emprestimo getEmprestimoAtual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
