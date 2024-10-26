package com.br.sissec.SISSEC.MODEL;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ALUNOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_aluno;
    private Integer id_turma;
    private Integer id_aula;
    private String nome_aluno;
    private String matricula_aluno;
    private String cpf_aluno;
    private Date dt_nascimento_aluno;
    private String turma_aluno;
    private String turno_aluno;

    public Integer getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Integer id_aluno) {
        this.id_aluno = id_aluno;
    }

    public Integer getId_turma() {
        return id_turma;
    }

    public void setId_turma(Integer id_turma) {
        this.id_turma = id_turma;
    }

    public Integer getId_aula() {
        return id_aula;
    }

    public void setId_aula(Integer id_aula) {
        this.id_aula = id_aula;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getMatricula_aluno() {
        return matricula_aluno;
    }

    public void setMatricula_aluno(String matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    public String getCpf_aluno() {
        return cpf_aluno;
    }

    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public Date getDt_nascimento_aluno() {
        return dt_nascimento_aluno;
    }

    public void setDt_nascimento_aluno(Date dt_nascimento_aluno) {
        this.dt_nascimento_aluno = dt_nascimento_aluno;
    }

    public String getTurma_aluno() {
        return turma_aluno;
    }

    public void setTurma_aluno(String turma_aluno) {
        this.turma_aluno = turma_aluno;
    }

    public String getTurno_aluno() {
        return turno_aluno;
    }

    public void setTurno_aluno(String turno_aluno) {
        this.turno_aluno = turno_aluno;
    }
}
