
public abstract class AlarmeObservador {
	
	protected AlarmeSubject alarme;

	public AlarmeObservador(AlarmeSubject alarme) {
		this.alarme = alarme;
	}

	public abstract void avisaDecteccaoDeMovimento();
}