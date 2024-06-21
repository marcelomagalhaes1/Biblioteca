/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valdi
 */
public class Biblioteca {

    private String nome;
    private String endereco;
    private final List<Livro> livros;
    private final List<Artigo> artigos;
    private final List<Emprestimo> emprestimos;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
        this.artigos = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

     public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void adicionarArtigo(Artigo artigo) {
        this.artigos.add(artigo);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
