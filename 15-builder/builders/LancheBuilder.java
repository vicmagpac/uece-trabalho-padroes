package com.engsw.igor.trabalhoengsw.builder.builders;

import com.engsw.igor.trabalhoengsw.builder.ItemProduct;

/**
 * Created by Igor on 10/09/2016.
 */
public abstract class LancheBuilder {
    protected ItemProduct item = new ItemProduct();
    public abstract void buildPreco();
    public abstract void buildDentroDaCaixa();
    public abstract void buildNome();
    public ItemProduct getItem(){
        return item;
    };
}
