package br.com.agenda.controller;

import java.util.List;

import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.entity.Contato;
import br.com.agenda.repositorio.ContatoRepository;


@RestController
@RequestMapping("/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoRepository repositorio;
	
	
	@GetMapping
	public List<Contato> listar() {
	//return	Contato.setProjection(Projections.distinct(Projections.property("id")));

		return repositorio.findAll();
	}
	


	
	

}