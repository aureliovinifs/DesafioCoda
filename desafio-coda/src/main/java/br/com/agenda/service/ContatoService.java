package br.com.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.repositorio.ContatoRepository;

@Service
public class ContatoService {
	//CRIA UM CONTATO REPOSITORY para ser usado quando sobe a aplicação
	
		@Autowired
		private ContatoRepository repositorio;
		
		
	

	
}
