
public class Aplicacao {
	public static void main(String args[]) {
		Logger logger = Logger.getInstance();
		logger.setAtivo(true);
		
		ILogger loggerView = new LoggerEventViewer();
		logger.log(loggerView, "PRIMEIRA MENSAGEM DE LOG");

		ILogger loggerDatabase = new LoggerDatabase();
		logger.log(loggerDatabase, "SEGUNDA MENSAGEM DE LOG");

		ILogger loggerFile = new LoggerFile();
		logger.log(loggerFile, "TERCEIRA MENSAGEM DE LOG");
	}
}