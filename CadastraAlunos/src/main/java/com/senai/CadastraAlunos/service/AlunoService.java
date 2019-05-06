package com.senai.CadastraAlunos.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.CadastraAlunos.dao.AlunoDAO;
import com.senai.CadastraAlunos.entity.Aluno;

@Service
@Transactional
public class AlunoService {

	private AlunoDAO alunoDAO;

	@Autowired
	public AlunoService(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}
	
	
	/**
	 * Método que insereAluno ainda não registrado
	 * @param aluno
	 * @return Aluno inserido no banco.
	 */
	public Aluno insereAluno(Aluno aluno)  throws IOException {
		return this.alunoDAO.save(aluno);		
	}
	
	
	/**
	 * Método que atualizaAluno caso ele ja exista.
	 * @param aluno
	 * @return Aluno atualizado no banco.
	 */
	public Aluno atualizaAluno(Aluno aluno) throws IOException {
		if(this.alunoDAO.existsById(aluno.getId()) == true) {
			return this.alunoDAO.save(aluno);
		}
		return null;
	}
	
	
	
	/**
	 * Método que removeAluno
	 * @param idAluno
	 * @throws IOException
	 */
	public void removeAluno(Long idAluno) throws IOException {
		this.alunoDAO.deleteById(idAluno);
	}
	
	/**
	 * Busc um Aluno pelo Id
	 * @param idAluno
	 * @return aluno
	 */
	public Aluno buscaAluno(Long idAluno) {
		return this.alunoDAO.getOne(idAluno);
	}
	
	/**
	 * Lista todos os Alunos cadastrados.
	 * @return
	 */
	public List<Aluno> listaAlunos() {
		return this.alunoDAO.findAll();
		
	}
	
}
