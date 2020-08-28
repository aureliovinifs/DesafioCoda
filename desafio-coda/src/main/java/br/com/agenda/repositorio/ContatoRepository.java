package br.com.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
