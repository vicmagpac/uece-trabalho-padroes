package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class BatataGrandeBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "bata grande";
    }

    @Override
    public void buildPreco() {
        item.preco = 8.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }
    
}
