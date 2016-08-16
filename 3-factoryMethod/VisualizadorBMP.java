
public class VisualizadorBMP implements IVisualizador {

	public IImagem visualizar() {
		return new ImagemBMP();
	}

}
