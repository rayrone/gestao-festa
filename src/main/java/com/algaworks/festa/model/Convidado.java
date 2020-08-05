package com.algaworks.festa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Convidado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    // H2
    //@GeneratedValue(strategy = IDENTITY)
    // PostgreSQL
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "convidado_generator")
    @SequenceGenerator(name="convidado_generator", sequenceName = "convidado_seq", initialValue = 4)
    private Long id;

    private String nome;

    private Integer quantidadeAcompanhantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return id.equals(convidado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidadeAcompanhantes=" + quantidadeAcompanhantes +
                '}';
    }
}
