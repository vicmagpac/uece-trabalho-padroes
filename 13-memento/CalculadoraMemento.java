package com.engsw.igor.trabalhoengsw.memento;

public class CalculadoraMemento {
	protected int estadoResultado;

	public CalculadoraMemento(int resultado) {
		estadoResultado = resultado;
	}

	public int getResultadoSalvo() {
		return estadoResultado;
	}
}