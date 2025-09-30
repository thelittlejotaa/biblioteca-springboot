package br.com.senai.infob.biblioteca.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="emprestimo_id")
    private int emprestimoId;

    @Column(name="aluno_id")
    private int alunoId;
    
    @Column(name="professor_id")
    private int profesorId;

    @Column(name="data_retirada")
    private LocalDate dataRetirada;

    @Column(name="data_devolucao")
    private LocalDate dataDvolucao;

    @Column(name="historico_emprestimo")
    private String historicoEmprestimo;

    public Emprestimo() {
    }

    public Emprestimo(int emprestimoId, int alunoId, int profesorId, LocalDate dataRetirada, LocalDate dataDvolucao,
            String historicoEmprestimo) {
        this.emprestimoId = emprestimoId;
        this.alunoId = alunoId;
        this.profesorId = profesorId;
        this.dataRetirada = dataRetirada;
        this.dataDvolucao = dataDvolucao;
        this.historicoEmprestimo = historicoEmprestimo;
    }

    public int getEmprestimoId() {
        return emprestimoId;
    }

    public void setEmprestimoId(int emprestimoId) {
        this.emprestimoId = emprestimoId;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDvolucao() {
        return dataDvolucao;
    }

    public void setDataDvolucao(LocalDate dataDvolucao) {
        this.dataDvolucao = dataDvolucao;
    }

    public String getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }

    public void setHistoricoEmprestimo(String historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
}
