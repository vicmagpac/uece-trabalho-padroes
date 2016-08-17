
public class DelegaciaDePoliciaObservador extends AlarmeObservador {

	public DelegaciaDePoliciaObservador(AlarmeSubject alarme) {
		super(alarme);
	}

	public void avisaDecteccaoDeMovimento() {
        System.out.println("ALARMANDO A POLICIA :: " + this.alarme.getEstado().aviso);
    }

}