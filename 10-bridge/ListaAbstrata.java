
public abstract class ListaAbstrata {

	protected ListaImplementada listaImplementada;

	public ListaAbstrata(ListaImplementada listaImplementada) {
		this.listaImplementada = listaImplementada;
	}

	public void imprimeLista(Lista lista) {
		this.listaImplementada.imprimeLista(lista);
	}

	public abstract void imprimir(Lista lista);

}