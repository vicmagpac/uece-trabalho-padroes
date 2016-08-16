
class Slot1 implements ISlot {
	private ISlot proximoSlot;

	public void setProximo(ISlot proximoSlot) {
		this.proximoSlot = proximoSlot;
	}

	public String captura(Produto produto, Moeda moeda) {
		if (moeda.getValor() >= produto.getValor()) {
			double troco = moeda.getValor() - produto.getValor();
			return produto.getNome() + " - R$ " +  produto.getValor() + "\n Troco - " + troco;
		} else {
			return this.proximoSlot.captura(produto, moeda);
		}
	}
}