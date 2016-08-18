
public abstract class ParticipanteComponent {
	public String nome;
	public int assento;
	public static int contadorAssento = 1;

	public ParticipanteComponent() {
		this.assento = contadorAssento++;
	}

	public String getNome() {
		return this.nome;
	}

	public void mostraNome() {
		System.out.println("Assento: " + this.assento + " / Participante: " + this.nome);
	}
}