package org.acme.resteasy.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pessoa extends PanacheEntity {

    @Column
    private String nome;

    @Column
    private String idade;

    @Column
    @OneToMany(mappedBy = "id")
    private List<Tarefa> tarefa;

    public void Pessoa(){
        // Constructor
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public List<Tarefa> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }
}

