package com.br.sissec.SISSEC.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class PROFESSORES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_professor;
    private Integer id_turma;
    private String nome_professor;
    private String matricula_professor;
    private String cpf_professor;
    private Date dt_nascimento_professor;
    private String turno_professor;
    private Date dt_vigencia_professor;

    public Integer getId_professor() {
        return id_professor;
    }

    public void setId_professor(Integer id_professor) {
        this.id_professor = id_professor;
    }

    public Integer getId_turma() {
        return id_turma;
    }

    public void setId_turma(Integer id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getMatricula_professor() {
        return matricula_professor;
    }

    public void setMatricula_professor(String matricula_professor) {
        this.matricula_professor = matricula_professor;
    }

    public String getCpf_professor() {
        return cpf_professor;
    }

    public void setCpf_professor(String cpf_professor) {
        this.cpf_professor = cpf_professor;
    }

    public Date getDt_nascimento_professor() {
        return dt_nascimento_professor;
    }

    public void setDt_nascimento_professor(Date dt_nascimento_professor) {
        this.dt_nascimento_professor = dt_nascimento_professor;
    }

    public String getTurno_professor() {
        return turno_professor;
    }

    public void setTurno_professor(String turno_professor) {
        this.turno_professor = turno_professor;
    }

    public Date getDt_vigencia_professor() {
        return dt_vigencia_professor;
    }

    public void setDt_vigencia_professor(Date dt_vigencia_professor) {
        this.dt_vigencia_professor = dt_vigencia_professor;
    }
}
