package com.br.sissec.SISSEC.DAO;

import com.br.sissec.SISSEC.MODEL.ALUNOS;
import com.br.sissec.SISSEC.MODEL.AULAS;
import com.br.sissec.SISSEC.MODEL.PROFESSORES;
import com.br.sissec.SISSEC.MODEL.TURMAS;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SisSecDAO {

    @PersistenceContext
    private EntityManager em;


    public List<ALUNOS> getAllAlunos(){
        return em.createNativeQuery("SELECT id_aluno, id_turma, id_aula, nome_aluno, matricula_aluno, cpf_aluno, " +
                        "dt_nascimento_aluno, turma_aluno, turno_aluno\n" +
                        "\tFROM secretaria.alunos;\n" +
                        "\t\n")
                .getResultList();
    }

    public List<PROFESSORES> getAllProfessores(){
        return em.createNativeQuery("SELECT id_professor, id_turma, nome_professor, matricula_professor, " +
                "cpf_professor, dt_nascimento_professor, turno_professor, dt_vigencia_professor\n" +
                "\tFROM secretaria.professores;")
                .getResultList();
    }

    public List<TURMAS> getAllTurmas(){
        return em.createNativeQuery("SELECT id_turma, id_professor, id_aluno, quant_alunos, materia, " +
                        "cpf_professor, sala\n" +
                        "\tFROM secretaria.turmas;")
                .getResultList();
    }

    public List<AULAS> getAllAulas(){
        return em.createNativeQuery("SELECT id_aula, id_sala, id_professor, id_aluno, materia\n" +
                        "\tFROM secretaria.aulas;")
                .getResultList();
    }

    @Transactional
    public void insertAluno(ALUNOS alunos){
        em.createNativeQuery("INSERT INTO secretaria.alunos(\n" +
                "\tid_turma, id_aula, nome_aluno, matricula_aluno, cpf_aluno, dt_nascimento_aluno, turma_aluno," +
                " turno_aluno)\n" +
                "\tVALUES (:id_turma, :id_aula, :nome_aluno, :matricula_aluno, :cpf_aluno, :dt_nascimento_aluno, :turma_aluno," +
                " :turno_aluno);")
                .setParameter("id_turma", alunos.getId_turma())
                .setParameter("id_aula", alunos.getId_aula())
                .setParameter("nome_aluno", alunos.getNome_aluno())
                .setParameter("matricula_aluno", alunos.getMatricula_aluno())
                .setParameter("cpf_aluno", alunos.getCpf_aluno())
                .setParameter("dt_nascimento_aluno", alunos.getDt_nascimento_aluno())
                .setParameter("turma_aluno", alunos.getTurma_aluno())
                .setParameter("turno_aluno", alunos.getTurno_aluno())
                .executeUpdate();
    }

    @Transactional
    public void insertProfessor(PROFESSORES professores){
        em.createNativeQuery("INSERT INTO secretaria.professores(\n" +
                "\tid_turma, nome_professor, matricula_professor, cpf_professor, dt_nascimento_professor, turno_professor, " +
                "dt_vigencia_professor)\n" +
                "\tVALUES (:id_turma, :nome_professor, :matricula_professor, :cpf_professor, :dt_nascimento_professor, :turno_professor, " +
                ":dt_vigencia_professor);")
                .setParameter("id_turma", professores.getId_turma())
                .setParameter("nome_professor", professores.getNome_professor())
                .setParameter("matricula_professor", professores.getMatricula_professor())
                .setParameter("cpf_professor", professores.getCpf_professor())
                .setParameter("dt_nascimento_professor", professores.getDt_nascimento_professor())
                .setParameter("turno_professor", professores.getTurno_professor())
                .setParameter("dt_vigencia_professor", professores.getDt_vigencia_professor())
                .executeUpdate();
    }

}
