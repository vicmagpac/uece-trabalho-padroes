package com.engsw.igor.trabalhoengsw.factoryMethod;

/**
 * Created by Igor on 15/08/2016.
 */
public class FabricaVisualizadorJPG implements FabricaDeVisualizador {

    @Override
    public Visualizador criarVisualizador() {
        return new VisualizadorJPG();
    }
}
