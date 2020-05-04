package com.silvio.rest;

import com.silvio.cepservice.CepService;
import com.silvio.model.Endereco;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cep")
public class CepResource {

    // Classe gerenciada pelo CDI(ela é um menaged Bean)
    @Inject
    CepService cepService;
    
    @GET
    @Path("/{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") String cep) {
        return  cepService.buscaEndereco(cep);
    }
}