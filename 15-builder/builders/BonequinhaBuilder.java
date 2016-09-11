package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class BonequinhaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "bonequinha";
    }

    @Override
    public void buildPreco() {
        item.preco = 2.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }
    
}
