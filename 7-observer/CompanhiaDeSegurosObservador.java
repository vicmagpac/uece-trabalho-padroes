
public class CompanhiaDeSegurosObservador extends AlarmeObservador {

	public CompanhiaDeSegurosObservador(AlarmeSubject alarme) {
		super(alarme);
	}

	public void avisaDecteccaoDeMovimento() {
        System.out.println("ALARMANDO A COMPANHIA DE SEGUROS :: " + this.alarme.getEstado().aviso);
    }

}