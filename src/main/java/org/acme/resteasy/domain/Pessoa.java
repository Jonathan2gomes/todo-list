package org.acme.resteasy.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Pessoa extends PanacheEntity {

    @Column
    private String nome;

    @Column
    private String idade;

    @OneToMany
    @JoinColumn(name="id_lista_tarefas")
    @Column
    private List<ListaTarefas> listaTarefas;

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

    public List<ListaTarefas> getLista() {
        return listaTarefas;
    }

    public void setLista(List<ListaTarefas> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
}
