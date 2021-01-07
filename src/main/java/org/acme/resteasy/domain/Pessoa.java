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

    @OneToMany(mappedBy="id_tarefa", cascade = CascadeType.ALL)
    @Column
    private List<Tarefa> tarefa;

    public void Pessoa(){
        // método construtor
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

    public List<Tarefa> getLista() {
        return tarefa;
    }

    public void setLista(List<Tarefa> tarefas) {
        this.tarefa = tarefas;
    }
}
