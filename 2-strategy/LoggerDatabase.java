
class LoggerDatabase implements ILogger {
	public void log(String mensagem) {
		/**
		* Implementação da geração do log no banco de dados...
		*/
		System.out.println("LOG EM BANCO DE DADOS :: " + mensagem);
	}
}