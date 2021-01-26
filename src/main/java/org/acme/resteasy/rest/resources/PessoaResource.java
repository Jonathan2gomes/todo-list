package org.acme.resteasy.rest.resources;

import org.acme.resteasy.domain.Pessoa;
import org.acme.resteasy.rest.dto.PessoaDTO;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("pessoas")
public class PessoaResource {
    //primeiramente vamos listar todas as pessoas
    @GET
    public List<PessoaDTO> buscarToDoListPorPessoa(){

        List<Pessoa> pessoas = Pessoa.listAll();

        return pessoas.stream().map(PessoaDTO::new).collect(Collectors.toList());
    }

    //aqui vamos listar a lista de uma pessoa em específico
    @GET
    @Path("{id_pessoa}")
    public Pessoa pessoa(@PathParam("id_pessoa")String idPessoa){
        Pessoa pessoa = Pessoa.findById(idPessoa);
        return pessoa;
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Transactional
    @Path("pessoa")
    public PessoaDTO SalvarPessoa(PessoaDTO pessoa){

        pessoa.pessoaDTOtoPessoa().persist();

        return pessoa;
    }
}
