package com.senai.CadastraAlunos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.CadastraAlunos.entity.Aluno;

@Repository
public interface AlunoDAO extends JpaRepository<Aluno, Long> {

	
}
