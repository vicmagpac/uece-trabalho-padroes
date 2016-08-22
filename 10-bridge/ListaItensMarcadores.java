
public class ListaItensMarcadores implements ListaImplementada {

	public void imprimeLista(Lista lista) {
		for (String listaTmp : lista.getItens()) {
			System.out.println(" - " + listaTmp);
		}
	}
}