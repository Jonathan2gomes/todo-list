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

    public Pessoa gerarPessoaDTO(){
        Pessoa pessoa = new Pessoa();

        pessoa.id = this.id;
        pessoa.setNome(this.nome);
        pessoa.setIdade(this.idade);
        pessoa.setTarefa(this.tarefas);

        return pessoa;
    }
}
