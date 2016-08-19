
public ListaItensNumeros implements ListaImplementada {

	public void imprimeLista(Lista lista) {
		int i = 1;
		for (Lista listaTmp : lista) {
			System.out.println(i + " " + listaTmp);
		}
	}
}