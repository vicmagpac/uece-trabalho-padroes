
public class Cliente {
	public static void main(String args[]) {
		Joystick joy = new Joystick();
		joy.executar(new ReceptorFutebol());

		System.out.println();

		Joystick joy2 = new Joystick();
		joy2.executar(new ReceptorCorrida());

		System.out.println();

		Joystick joy3 = new Joystick();
		joy3.executar(new ReceptorLuta());
	}
}