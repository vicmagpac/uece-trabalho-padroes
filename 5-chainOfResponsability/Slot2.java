
class Slot2 implements ISlot {
	private ISlot proximoSlot;
	private Produto produto;

	public Slot2() {
		this.produto = new Produto("REFRIGERANTE", 10);
	} 

	public void setProximo(ISlot proximoSlot) {
		this.proximoSlot = proximoSlot;
	}

	public String captura(Moeda moeda) {
		if (moeda.getValor() >= this.produto.getValor()) {
			double troco = moeda.getValor() - this.produto.getValor();
			return this.produto.getNome() + " - R$ " +  this.produto.getValor() + "\n Troco - " + troco;
		} else {
			return this.proximoSlot.captura(moeda);
		}
	}
}
