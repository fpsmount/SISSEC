package com.br.sissec.SISSEC.CONTROLLER;

import com.br.sissec.SISSEC.DAO.SisSecDAO;
import com.br.sissec.SISSEC.MODEL.ALUNOS;
import com.br.sissec.SISSEC.MODEL.AULAS;
import com.br.sissec.SISSEC.MODEL.PROFESSORES;
import com.br.sissec.SISSEC.MODEL.TURMAS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/sissec")
public class SisSecCONTROLLER {

    @Autowired
    SisSecDAO sissecdao;


    @GetMapping(value = "/todos-os-alunos")
    public List<ALUNOS> getAllAlunos(){
        return sissecdao.getAllAlunos();
    }

    @GetMapping(value ="/todos-os-professores")
    public List<PROFESSORES> getAllProfesores(){
        return sissecdao.getAllProfessores();
    }

    @GetMapping(value = "/todas-as-turmas")
    public List<TURMAS> getAllTurmas(){
        return sissecdao.getAllTurmas();
    }

    @GetMapping(value = "/todas-as-aulas")
    public List<AULAS> getAllAulas(){
        return sissecdao.getAllAulas();
    }

    @PostMapping(value = "/inserir-aluno")
    public ResponseEntity<String> inserirAluno(@RequestBody ALUNOS alunos){
        sissecdao.insertAluno(alunos);
        return ResponseEntity.ok("Aluno inserido com sucesso");
    }

    @PostMapping(value = "/inserir-professor")
    public ResponseEntity<String> inserirProfessor(@RequestBody PROFESSORES professores){
        sissecdao.insertProfessor(professores);
        return ResponseEntity.ok("Professor inserido com sucesso");
    }

}
