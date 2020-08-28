package br.com.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
