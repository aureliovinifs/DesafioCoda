package br.com.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.entity.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
