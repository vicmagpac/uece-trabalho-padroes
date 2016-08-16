
public class Logger {
	private boolean ativo = false;

	public Logger() {}

	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void log(String mensagem) {
		if (this.ativo) {
			System.out.println("LOG :: " + mensagem);
		}
	}
}