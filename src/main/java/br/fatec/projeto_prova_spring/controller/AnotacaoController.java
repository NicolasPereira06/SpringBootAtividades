package br.fatec.projeto_prova_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import br.fatec.projeto_prova_spring.entity.View;

import br.fatec.projeto_prova_spring.entity.Anotacao;
import br.fatec.projeto_prova_spring.repository.AnotacaoRepository;

@RestController
@RequestMapping(value = "/anotacao")
@CrossOrigin
public class AnotacaoController {

    @Autowired
    private AnotacaoRepository repo;

    @JsonView(View.AnotacaoView.class)
    @GetMapping
    public List<Anotacao> buscarTodas() {
        return repo.findAll();
    }
    
}
