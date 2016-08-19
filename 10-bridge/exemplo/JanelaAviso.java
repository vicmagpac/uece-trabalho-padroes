
public class JanelaAviso extends JanelaAbstrata {

	public JanelaAviso(JanelaImplementada janelaImplementada) {
		super(janelaImplementada);
	}

	public void desenhar() {
		this.desenharJanela("Janela aviso");

		this.desenharBotao("Ok");
	}
}