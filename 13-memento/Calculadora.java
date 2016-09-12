package com.engsw.igor.trabalhoengsw.memento;

public class Calculadora {
	protected Integer resultado;
	ResultadoTaker resultadoTaker;

	public Calculadora() {
		resultadoTaker = new ResultadoTaker();
		resultado =0;
	}

	public void somar(int valor){

		resultadoTaker.adicionarMemento(new CalculadoraMemento(resultado));
		resultado += valor;
	}

	public void subtrair(int valor){

		resultadoTaker.adicionarMemento(new CalculadoraMemento(resultado));
		resultado -= valor;


	}
	public void dividir(int valor){

		try {
			resultadoTaker.adicionarMemento(new CalculadoraMemento(resultado));
			resultado /= valor;
		} catch (Exception exception){
			exception.printStackTrace();
			System.out.println("Não foi possível dividir");
			desfazerOperacao();
		}


	}

	public void multiplicar(int valor){

		resultadoTaker.adicionarMemento(new CalculadoraMemento(resultado));
		resultado *= valor;


	}

	public void desfazerOperacao() {
		resultado = resultadoTaker.getUltimoEstadoSalvo().getResultadoSalvo();
	}

	public void mostrarResultado() {
		System.out.println(resultado);
	}

}