import java.util.ArrayList;

public class AlarmeSubject {
	protected ArrayList<AlarmeObservador> observadores;
	protected Alarme alarme;

	public AlarmeSubject() {
		this.observadores = new ArrayList<AlarmeObservador>();
	}

	public void adicionar(AlarmeObservador observador) {
		this.observadores.add(observador);
	}

	public void remover(int indice) {
		this.observadores.remove(indice);
	}

	public void setEstado(Alarme alarme) {
		this.alarme = alarme;
		this.notificarObservadores();
	}

	public Alarme getEstado() {
		return this.alarme;
	}	

	private void notificarObservadores() {
		for (AlarmeObservador observador : this.observadores) {
			observador.avisaDecteccaoDeMovimento();
		}
	}
}