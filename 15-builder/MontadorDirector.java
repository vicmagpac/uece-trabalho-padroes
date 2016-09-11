package com.engsw.igor.trabalhoengsw.builder;

import com.engsw.igor.trabalhoengsw.builder.builders.LancheBuilder;

/**
 * Created by Igor on 10/09/2016.
 */
public class MontadorDirector {

    protected LancheBuilder montador;

    public MontadorDirector(LancheBuilder montador) {
        this.montador = montador;
    }

    public void montarItem() {
        montador.buildNome();
        montador.buildPreco();
        montador.buildDentroDaCaixa();
    }

    public ItemProduct getItem() {
        return montador.getItem();
    }
}
