
class Cliente {
	public static void main(String args[]) {

		IVisualizador visualizador = new VisualizadorJPG();
		IImagem imagemJPG = visualizador.visualizar();
		imagemJPG.carregar();
		imagemJPG.exibir();
		imagemJPG.fechar();

		System.out.println();
		System.out.println();

		IVisualizador visualizador2 = new VisualizadorBMP();
		IImagem imagemBMP = visualizador2.visualizar();
		imagemBMP.carregar();
		imagemBMP.exibir();
		imagemBMP.fechar();
	}
}