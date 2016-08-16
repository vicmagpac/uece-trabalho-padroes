
public class VisualizadorJPG implements IVisualizador {

	public IImagem visualizar() {
		return new ImagemJPG();
	}

}
