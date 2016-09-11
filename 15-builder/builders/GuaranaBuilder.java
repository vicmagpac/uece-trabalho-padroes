package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class GuaranaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "guaraná";
    }

    @Override
    public void buildPreco() {
        item.preco = 5.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = false;
    }
    
}
