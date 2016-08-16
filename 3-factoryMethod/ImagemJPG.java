
public class ImagemJPG implements IImagem {
	public void carregar() {
		System.out.println("Imagem JPG:");
		System.out.println("Carregando imagem JPG...");
	}

	public void exibir() {
		System.out.println("Exibindo imagem por 5 segundos");
	}

	public void fechar() {
		System.out.println("Fechando imagem\n");
	}
}