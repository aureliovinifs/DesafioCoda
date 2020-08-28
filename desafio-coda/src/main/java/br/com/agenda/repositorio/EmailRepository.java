package br.com.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Long>{

}
