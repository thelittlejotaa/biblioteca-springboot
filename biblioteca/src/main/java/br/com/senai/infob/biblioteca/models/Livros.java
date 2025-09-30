package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="livros")
public class Livros {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="livro_id")
    private int livroId;

    @Column(name="titulo")
    private String titulo;

    @Column(name="autor")
    private String autor;

    @Column(name="editora")
    private String editora;

    @Column(name="genero")
    private String genero;

    @Column(name="copia_livro")
    private String copiaLivro;

    public Livros() {
    }

 
    public Livros(int livroId, String titulo, String autor, String editora, String genero, String copiaLivro) {
        this.livroId = livroId;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.copiaLivro = copiaLivro;
    }

    
    public int getLivroId() {
        return livroId;
    }

    
    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    
    public String getTitulo() {
        return titulo;
    }

  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }

    
    public void setAutor(String autor) {
        this.autor = autor;
    }

   
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    
    public String getGenero() {
        return genero;
    }

 
    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public String getCopiaLivro() {
        return copiaLivro;
    }

   
    public void setCopiaLivro(String copiaLivro) {
        this.copiaLivro = copiaLivro;
    }
    
}
