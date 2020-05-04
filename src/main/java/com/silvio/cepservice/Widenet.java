/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.cepservice;

import javax.enterprise.context.Dependent;

/**
 *
 * @author silvio
 */
@Dependent
public final class Widenet extends AbstractCepService{

    public Widenet() {
        super("https://cep.widenet.host/");
    }
    
    @Override
    protected String buildPath(String cep) {
        return String.format("busca-cep/api/cep/%s"+".json", cep);
    }
    
}
