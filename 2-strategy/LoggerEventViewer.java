
public class LoggerEventViewer implements ILogger {
	public void log(String mensagem) {
		System.out.println("LOG NA VISÃO:: " + mensagem);
	}
}