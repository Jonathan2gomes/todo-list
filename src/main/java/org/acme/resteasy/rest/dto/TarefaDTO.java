package org.acme.resteasy.rest.dto;

import org.acme.resteasy.domain.Pessoa;
import org.acme.resteasy.domain.Tarefa;

import java.time.LocalDate;

public class TarefaDTO {

    private Long id;
    private String nome;
    private LocalDate data;
    private PessoaDTO pessoa;
    private boolean concluido;

    public TarefaDTO(){
        // constructor para serialização
    }

    public TarefaDTO(Tarefa tarefa){
        this.id = tarefa.id;
        this.nome = tarefa.getNome();
        this.data = tarefa.getData();
        this.pessoa = new PessoaDTO();
        this.concluido = tarefa.isConcluido();
    }

    public Tarefa gerarTarefa(){
        Tarefa tarefa = new Tarefa();

        tarefa.setNome(this.nome);
        tarefa.setData(this.data);
        tarefa.setPessoa(Pessoa.find("nome", nome).firstResult());
        tarefa.setConcluido(this.concluido);

        return tarefa;
    }

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
