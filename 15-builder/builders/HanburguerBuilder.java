package com.engsw.igor.trabalhoengsw.builder.builders;

/**
 * Created by Igor on 10/09/2016.
 */
public class HanburguerBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "hambúrguer";
    }

    @Override
    public void buildPreco() {
        item.preco = 10.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }

}
