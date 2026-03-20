package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "epi")
public class Epi {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="epi_id")
    private int epiId;

    @Column(name="nome")
    private String nome;

    @Column(name="categoria")
    private String categoria;

    @Column(name="QuantidadeEmUso")
    private int QuantidadeEmUso;

    //foreing ke com setor
    public Epi() {
    }

    public int getEpiId() {
        return epiId;
    }

    public void setEpiId(int epiId) {
        this.epiId = epiId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEmUso() {
        return QuantidadeEmUso;
    }

    public void setQuantidadeEmUso(int quantidadeEmUso) {
        QuantidadeEmUso = quantidadeEmUso;
    }
}
