package com.engsw.igor.trabalhoengsw.memento;

import java.util.ArrayList;

public class ResultadoTaker {
	protected ArrayList<CalculadoraMemento> estados;

	public ResultadoTaker() {
		estados = new ArrayList<CalculadoraMemento>();
	}

	public void adicionarMemento(CalculadoraMemento memento) {
		estados.add(memento);
	}

	public CalculadoraMemento getUltimoEstadoSalvo() {
		if (estados.size() <= 0) {
			return new CalculadoraMemento(0);
		}
		CalculadoraMemento estadoSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);
		return estadoSalvo;
	}
}