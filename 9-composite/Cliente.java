
public class Cliente {

	public static void main(String[] args) {
	
		try {
			ParticipanteComponent participanteIndividuo1 = new ParticipanteIndividuo("Victor Magalhães");
			ParticipanteComponent participanteIndividuo2 = new ParticipanteIndividuo("Igor");
			ParticipanteComponent participanteIndividuo3 = new ParticipanteIndividuo("Edgar");
			ParticipanteComponent participanteIndividuo4 = new ParticipanteIndividuo("Pacheco");
			ParticipanteComponent participanteInstituicao1 = new ParticipanteInstituicao("Google");
			ParticipanteComponent participanteInstituicao2 = new ParticipanteInstituicao("Microsoft");

			ParticipanteComponent congresso = new CongressoComposite("Congresso Design Patterns", 10);

			((CongressoComposite) congresso).adicionarParticipante(participanteIndividuo1);
			((CongressoComposite) congresso).adicionarParticipante(participanteIndividuo2);
			((CongressoComposite) congresso).adicionarParticipante(participanteIndividuo3);
			((CongressoComposite) congresso).adicionarParticipante(participanteIndividuo4);
			((CongressoComposite) congresso).adicionarParticipante(participanteInstituicao1);
			((CongressoComposite) congresso).adicionarParticipante(participanteInstituicao2);
			congresso.mostraNome();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
