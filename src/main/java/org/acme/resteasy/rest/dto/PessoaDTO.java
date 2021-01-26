package org.acme.resteasy.rest.dto;

import org.acme.resteasy.domain.Pessoa;
import org.acme.resteasy.domain.Tarefa;

import java.util.List;

public class PessoaDTO {

    private Long id;
    private String nome;
    private String idade;
    private List<Tarefa> tarefas;

    public PessoaDTO(){
        // Constructor
    }

    public PessoaDTO(Pessoa pessoa){
        this.id = id;
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa pessoaDTOtoPessoa(){
        Pessoa pessoa = new Pessoa();

        pessoa.id = this.id;
        pessoa.setNome(this.nome);
        pessoa.setIdade(this.idade);
        pessoa.setTarefa(this.tarefas);

        return pessoa;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
