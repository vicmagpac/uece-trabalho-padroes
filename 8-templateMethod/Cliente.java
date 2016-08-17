
import java.io.IOException;

public class Cliente {
	public static void main(String args[]) throws IOException {
		Controlador controle = new Controlador(TipoTransformacao.maiusculo);
		controle.lerTexto();
		controle.mostrarTransformacao();

		controle.setTipoTransformacao(TipoTransformacao.minusculo);
		controle.mostrarTransformacao();

		controle.setTipoTransformacao(TipoTransformacao.duplicada);
		controle.mostrarTransformacao();

		controle.setTipoTransformacao(TipoTransformacao.inverso);
		controle.mostrarTransformacao();
	}

}