package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class CocaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "coca";
    }

    @Override
    public void buildPreco() {
        item.preco = 4.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = false;
    }
    
}
