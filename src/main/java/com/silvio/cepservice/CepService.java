/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.cepservice;

import com.silvio.model.Endereco;

/**
 *
 * @author silvio
 */
public interface CepService {
    Endereco buscaEndereco(String cep);
}
