package org.acme.resteasy.service;

import org.acme.resteasy.domain.Pessoa;

public class PessoaService {

    public void imprimirPessoaETarefa(){
        Pessoa p = new Pessoa();
        p.getNome();

        System.out.println(p);
    }
}
