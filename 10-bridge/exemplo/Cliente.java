
public class Cliente {
	public static void main(String args[]) {
		JanelaAbstrata janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();

		System.out.println();

		JanelaAbstrata janela2 = new JanelaDialogo(new JanelaLinux());
		janela2.desenhar();
	}
}