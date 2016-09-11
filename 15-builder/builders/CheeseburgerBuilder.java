package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class CheeseburgerBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "cheeseburguer";
    }

    @Override
    public void buildPreco() {
        item.preco = 11.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }
    
}
