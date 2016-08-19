
public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada janelaImplementada) {
		super(janelaImplementada);
	}

	public void desenhar() {
		this.desenharJanela("Janela diálogo");

		this.desenharBotao("Botão Sim");
        this.desenharBotao("Botão Não");
        this.desenharBotao("Botão Cancelar");
	}
}