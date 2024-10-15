package br.com.fiap.controllers;

import br.com.fiap.models.Pessoa;
import br.com.fiap.dtos.PessoaDto;
import br.com.fiap.infra.FakeDb;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/pessoa")
public class HelloResource {

    @GET
    @Path("/listar-todas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPessoa(){
        return Response.status(Response.Status.OK).entity(FakeDb.pessoa).build();
    }

    @POST
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirPessoa(PessoaDto dto){
        if (dto.getId() == null){
            return Response.status(Response.Status.BAD_REQUEST).entity(Map.of("Mensagem", "id invalido")).build();
        }
        Pessoa pessoa = new Pessoa(dto.getId(), dto.getNome(), dto.getEndereco());
        FakeDb.pessoa.put(pessoa.getId(), pessoa);
        return Response.status(Response.Status.CREATED).entity(pessoa).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") Long id, PessoaDto dto){
        if (!FakeDb.pessoa.containsKey(id)){
            return Response.status(Response.Status.NOT_FOUND).entity(Map.of("Mensagem", "id invalido")).build();
        }
        Pessoa pessoa = FakeDb.pessoa.get(id);
        pessoa.setNome(dto.getNome());
        FakeDb.pessoa.replace(id, pessoa);
        return Response.status(Response.Status.CREATED).entity(pessoa).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        if (FakeDb.pessoa.containsKey(id)){
            FakeDb.pessoa.remove(id);
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }
}
