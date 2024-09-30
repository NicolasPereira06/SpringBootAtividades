package br.fatec.projeto_prova_spring.service;

import java.util.List;

import br.fatec.projeto_prova_spring.entity.Usuario;

public interface UsuarioService {

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPeloId(Long id);
    
}
