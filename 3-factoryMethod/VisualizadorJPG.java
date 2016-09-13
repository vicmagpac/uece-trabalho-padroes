package com.engsw.igor.trabalhoengsw.factoryMethod;

/**
 * Created by Igor on 15/08/2016.
 */
public class VisualizadorJPG implements Visualizador{

    @Override
    public void visualizar() {
        ImagemJPG imagemJPG = new ImagemJPG();
        imagemJPG.carregar();
        imagemJPG.exibir();
        imagemJPG.fechar();
    }
}
