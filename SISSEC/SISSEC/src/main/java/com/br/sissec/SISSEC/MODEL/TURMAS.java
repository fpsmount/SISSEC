package com.br.sissec.SISSEC.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TURMAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_turma;
    private Integer quant_alunos;
    private String materia;
    private Integer id_professor;
    private String sala;

    public Integer getId_turma() {
        return id_turma;
    }

    public void setId_turma(Integer id_turma) {
        this.id_turma = id_turma;
    }

    public Integer getQuant_alunos() {
        return quant_alunos;
    }

    public void setQuant_alunos(Integer quant_alunos) {
        this.quant_alunos = quant_alunos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getId_professor() {
        return id_professor;
    }

    public void setId_professor(Integer id_professor) {
        this.id_professor = id_professor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
