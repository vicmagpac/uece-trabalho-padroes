
public abstract class JanelaAbstrata {

	protected JanelaImplementada janelaImplementada;

	public JanelaAbstrata(JanelaImplementada janelaImplementada) {
		this.janelaImplementada = janelaImplementada;
	}

	public void desenharJanela(String titulo) {
		this.janelaImplementada.desenharJanela(titulo);
	}

	public void desenharBotao(String titulo) {
		this.janelaImplementada.desenharBotao(titulo);
	}

	public abstract void desenhar();
}