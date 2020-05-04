/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.cepservice;


public class PostmonCepService extends AbstractCepService {

    public PostmonCepService(String dominio) {
        super("https://api.postmon.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("v1/cep/%s", cep);
    }
    
}
