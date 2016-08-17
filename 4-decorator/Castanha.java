package com.engsw.igor.trabalhoengsw.decorator;

/**
 * Created by Igor on 15/08/2016.
 */
public class Castanha extends YogurtDecorator {

    public Castanha(Yogurt umYogurt){
        super(umYogurt);
        nome = "Castanha";
        preco = 1.0;
    }
}
