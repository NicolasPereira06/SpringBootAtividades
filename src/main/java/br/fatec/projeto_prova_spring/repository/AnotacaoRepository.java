package br.fatec.projeto_prova_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.projeto_prova_spring.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}
