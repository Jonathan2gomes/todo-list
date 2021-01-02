package org.acme.resteasy.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ListaTarefas extends PanacheEntity {

    @Column
    private String titulo;

    @Column
    private String itemLista;

    @Column
    private String descricao;

    public ListaTarefas(){
        //método construtor
    }

    public ListaTarefas gerarLista(){
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.setTitulo(this.titulo);
        listaTarefas.setItemLista(this.descricao);

        return listaTarefas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getItemLista() {
        return itemLista;
    }

    public void setItemLista(String conteudo) {
        this.itemLista = conteudo;
    }

}
