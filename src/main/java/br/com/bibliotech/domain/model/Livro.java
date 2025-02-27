package br.com.bibliotech.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulos;
    private String autores;
    private LocalDate dataPublicacao;
    private String isbn;
    private String editora;

    public Livro() {
    }

    public Livro(Long id, String titulos, String autores, LocalDate dataPublicacao, String isbn, String editora) {
        this.id = id;
        this.titulos = titulos;
        this.autores = autores;
        this.dataPublicacao = dataPublicacao;
        this.isbn = isbn;
        this.editora = editora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
