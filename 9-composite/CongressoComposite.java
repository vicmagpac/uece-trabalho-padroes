import java.util.ArrayList;

public class CongressoComposite extends ParticipanteComponent {

	protected ArrayList<ParticipanteComponent> participantes;

	private int quantidadeMaxima;

	public CongressoComposite(String nome, int quantidadeMaxima) {
		this.nome = nome;
		this.quantidadeMaxima = quantidadeMaxima;

		this.participantes = new ArrayList<ParticipanteComponent>();
	}

	public void mostraNome() {
		System.out.println("Nome do congresso: " + this.nome);

		for (ParticipanteComponent participanteTmp : this.participantes) {
			participanteTmp.mostraNome();
		} 
		System.out.println();
	}

	public void adicionarParticipante(ParticipanteComponent novoParticipante) throws Exception {
		if (ParticipanteComponent.contadorAssento <= this.quantidadeMaxima) {
			this.participantes.add(novoParticipante);
		} else {
			throw new Exception("Não foi possivel adicionar participante - Congresso está lotado");	
		}		
		
	}

	public void remover(String nome) throws Exception {
		for (ParticipanteComponent participanteTmp : this.participantes) {
			if (participanteTmp.getNome() == nome) {
				this.participantes.remove(participanteTmp);
				return;
			}
		}
		throw new Exception("Não existe este participante");
	}

	public ParticipanteComponent getParticipante(String nome) throws Exception {
		for (ParticipanteComponent participanteTmp : this.participantes) {
			if (participanteTmp.getNome() == nome) {
				return participanteTmp;
			}
		}
		throw new Exception("Não existe este participante");
	}
}