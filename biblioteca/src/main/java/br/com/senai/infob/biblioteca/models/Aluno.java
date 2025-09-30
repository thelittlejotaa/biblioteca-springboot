package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="aluno_id")
    private int alunoId;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="matricula")
    private int matricula;

    @Column(name="email")
    private String email;

    @Column(name="telefone")
    private int telefone;

    @Column(name="historico_emprestimo")
    private String historicoEmprestimo;

    public Aluno() {
    }

    public Aluno(int alunoId, String nomeCompleto, int matricula, String email, int telefone, String historicoEmprestimo ) {
        this.alunoId = alunoId;
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
        this.historicoEmprestimo = historicoEmprestimo;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }

    public void setHistoricoEmprestimo(String historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
}
