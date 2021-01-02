package org.acme.resteasy.rest.resources;

import org.acme.resteasy.domain.Pessoa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("pessoas")
public class PessoaResource {
    //primeiramente vamos listar todas as pessoas
    @GET
    public List<Pessoa> buscarToDoListPorPessoa(){

        List<Pessoa> listaPessoas = Pessoa.listAll();

        return listaPessoas;
    }

    //aqui vamos listar a lista de uma pessoa em específico
    @GET
    @Path("{id_pessoa}")
    public Pessoa pessoa(@PathParam("id_pessoa")String idPessoa){
        Pessoa pessoa = Pessoa.findById(idPessoa);
        return pessoa;
    }
}
