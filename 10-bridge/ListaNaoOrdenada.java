
import java.util.Collections;

public class ListaNaoOrdenada extends ListaAbstrata {

	public ListaOrdenada(ListaImplementada listaImplementada) {
		super(listaImplementada);
	}

	public void imprimir(Lista lista) {
		this.imprimeLista(lista);
	}
}