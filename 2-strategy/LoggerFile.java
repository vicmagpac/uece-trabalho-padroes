
class LoggerFile implements ILogger {
	public void log(String mensagem) {
		/**
		* Implementação da geração do log no arquivo...
		*/
		System.out.println("LOG EM ARQUIVO :: " + mensagem);
	}
}