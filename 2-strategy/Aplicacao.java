
public class Aplicacao {
	public static void main(String args[]) {
		Logger logger = Logger.getInstance();

		ILogger loggerView = new LoggerEventViewer();
		logger.setAtivo(true);
		logger.log(loggerView, "PRIMEIRA MENSAGEM DE LOG");



		ILogger loggerDatabase = new LoggerDatabase();
		logger.setAtivo(true);
		logger.log(loggerDatabase, "SEGUNDA MENSAGEM DE LOG");

		ILogger loggerFile = new LoggerFile();
		logger.setAtivo(true);
		logger.log(loggerFile, "TERCEIRA MENSAGEM DE LOG");
	}
}