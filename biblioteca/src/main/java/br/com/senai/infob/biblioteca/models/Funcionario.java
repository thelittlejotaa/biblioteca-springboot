package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="funcionario")
    private int FuncionarioId; 

    @Column(name="nomeFuncionario")
    private String NomeFuncionario; 
    //foreing key setor id

    public Funcionario() {
    }

    public int getFuncionarioId() {
        return FuncionarioId;
    }

    public void setFuncionarioId(int FuncionarioId) {
        this.FuncionarioId = FuncionarioId;
    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }    
}
