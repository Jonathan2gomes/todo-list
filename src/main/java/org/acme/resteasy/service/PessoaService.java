package org.acme.resteasy.service;

import org.acme.resteasy.domain.Pessoa;
import org.acme.resteasy.domain.Tarefa;

public class PessoaService {

    public void imprimirPessoaETarefa(){
        Pessoa p = new Pessoa();
        p.setNome("Jonathan");
        p.setTarefa(Tarefa.find("nome", "acordar").firstResult());

        System.out.println(p);
    }
}
