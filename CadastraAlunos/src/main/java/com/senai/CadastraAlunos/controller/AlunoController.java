package com.senai.CadastraAlunos.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.senai.CadastraAlunos.entity.Aluno;
import com.senai.CadastraAlunos.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	AlunoService alunoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.put("lista", alunoService.listaAlunos());
		return "index";
	}
	
	@RequestMapping(value = "/novoAluno", method = RequestMethod.POST)
	public String novoAluno(ModelMap model) {
		return "cadastra-aluno";
	}
	
	@RequestMapping(value = "/cadastraAluno", method = RequestMethod.POST)
	public String cadastraAluno(Aluno aluno, ModelMap model) {
		try {
			alunoService.insereAluno(aluno);
		} catch ( IOException e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}	
	
	
	
}
