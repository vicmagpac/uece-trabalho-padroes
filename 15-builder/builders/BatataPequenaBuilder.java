package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class BatataPequenaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "batata pequena";
    }

    @Override
    public void buildPreco() {
        item.preco = 4.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }
    
}
