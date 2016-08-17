
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controlador {

	private String texto;

	private TransformaTemplate transformaTemplate;

	public Controlador(TipoTransformacao tipo) {
		this.setTipoTransformacao(tipo);
	}

	public void setTipoTransformacao(TipoTransformacao tipo) {
		switch (tipo) {
			case maiusculo:
				this.transformaTemplate = new TransformaMaiusculo();
				break;
			case minusculo:
				this.transformaTemplate = new TransformaMinusculo();
				break;
			case duplicada:
				this.transformaTemplate = new TransformaDuplicada();
				break;
			case inverso:
				this.transformaTemplate = new TransformaInverso();
				break;
		}
	}

	public void lerTexto() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o texto: ");
		this.texto = br.readLine();
	}


	public void mostrarTransformacao() {
		System.out.println(this.transformaTemplate.retornaTextoTransformado(this.texto));
	}

}