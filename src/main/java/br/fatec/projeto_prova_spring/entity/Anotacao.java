package br.fatec.projeto_prova_spring.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ant_anotacao")
public class Anotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ant_id")
    @JsonView({View.UsuarioView.class, View.AnotacaoView.class})
    private Long id;

    @Column(name = "ant_texto")
    @JsonView({View.UsuarioView.class, View.AnotacaoView.class})
    private String texto;

    @Column(name = "ant_data_hora")
    @JsonView({View.UsuarioView.class, View.AnotacaoView.class})
    private LocalDateTime dataHora;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ant_usr_id")
    @JsonView({View.AnotacaoView.class})
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

    
}


