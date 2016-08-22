import java.util.List;

public class Aplicacao {

	public static void main(String args[]) {

		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();

	}

}