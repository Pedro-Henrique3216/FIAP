package br.com.fiap.controllers;

import br.com.fiap.dtos.PessoaDto;
import br.com.fiap.exceptions.PessoaInvalida;
import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.models.Pessoa;
import br.com.fiap.service.PessoaService;
import br.com.fiap.service.PessoaServiceFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/pessoa")
public class PessoaController {

    private PessoaService pessoaService = PessoaServiceFactory.create();

    @GET
    @Path("/localizar-todos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPessoa(){
        return Response
                .status(Response.Status.OK)
                .entity(this.pessoaService.listarTodos())
                .build();
    }

    @POST
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPessoa(PessoaDto dto){
       try {
            Pessoa pessoa = new Pessoa(dto.getNome());
            pessoa = this.pessoaService.create(pessoa);
            return Response.status(Response.Status.CREATED).entity(pessoa).build();
        } catch (PessoaInvalida e){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of("mensagem","dados invalidos")).build();
        }
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePessoa(@PathParam("id") Long id,PessoaDto dto){
        try {
            Pessoa pessoa = this.pessoaService
                    .update(new Pessoa(dto.getId(), dto.getNome()));
            return Response.status(Response.Status.OK)
                    .entity(pessoa).build();
        } catch (PessoaNotFound e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(Map.of("mensagem","id não existe")).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deletePessoa(@PathParam("id") Long id){
        try {
            this.pessoaService.delete(id);
            return Response.status(Response.Status.NO_CONTENT).build();
        } catch (PessoaNotFound e){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
