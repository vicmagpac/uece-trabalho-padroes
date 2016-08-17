


public abstract class TransformaTemplate {

	public abstract String transforma(String texto);

	public String retornaTextoTransformado(String texto) {
		return this.transforma(texto);
	}

}