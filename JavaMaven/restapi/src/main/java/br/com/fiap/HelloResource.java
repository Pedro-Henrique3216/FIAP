package br.com.fiap;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/demo")
public class HelloResource {

    @GET
    @Path("/v1")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(){
        return """
                {"mensagem": "Hello World"}
                """;
    }

    @GET
    @Path("/v2")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHelloVersao2(){
        return "{\"mensagem\":\"Hello, World\"}";
    }

    @GET
    @Path("/pessoas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPessoa(){
        return Response.status(Response.Status.OK).entity(FakeDb.pessoa).build();
    }

    @POST
    @Path("/pessoa")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirPessoa(Pessoa pessoa){
        if (pessoa.getId() == null){
            return Response.status(Response.Status.BAD_REQUEST).entity(Map.of("Mensagem", "id invalido")).build();
        }
        FakeDb.pessoa.put(pessoa.getId(), pessoa);
        return Response.status(Response.Status.CREATED).entity(pessoa).build();
    }

    @PUT
    @Path("/pessoa/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") Long id, Pessoa pessoa){
        if (!FakeDb.pessoa.containsKey(id)){
            return Response.status(Response.Status.NOT_FOUND).entity(Map.of("Mensagem", "id invalido")).build();
        }
        FakeDb.pessoa.replace(id, pessoa);
        return Response.status(Response.Status.CREATED).entity(pessoa).build();
    }
}
