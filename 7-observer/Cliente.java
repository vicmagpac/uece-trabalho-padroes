public class Cliente {
	public static void main(String[] args) {
		AlarmeSubject alarme = new AlarmeSubject();
		alarme.adicionar(new DelegaciaDePoliciaObservador(alarme));
		alarme.adicionar(new CompanhiaDeSegurosObservador(alarme));

		alarme.setEstado(new Alarme("ASSALTO A MÃO ARMADA"));

		System.out.println();
		System.out.println();

		alarme.setEstado(new Alarme("ACIDENTE"));
	}
}
