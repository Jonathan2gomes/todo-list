package org.acme.resteasy.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Tarefa extends PanacheEntity {

    @Column
    private String numero;

    @Column
    private String itemLista;

    @Column
    private String descricao;

    public Tarefa(){
        //método construtor
    }

    public Tarefa gerarLista(){
        Tarefa tarefa = new Tarefa();
        tarefa.setNumero(this.numero);
        tarefa.setItemLista(this.descricao);

        return tarefa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String titulo) {
        this.numero = titulo;
    }

    public String getItemLista() {
        return itemLista;
    }

    public void setItemLista(String conteudo) {
        this.itemLista = conteudo;
    }

}
