
class Slot1 implements ISlot {
	private ISlot proximoSlot;

	public void setProximo(ISlot proximoSlot) {
		this.proximoSlot = proximoSlot;
	}

	public String captura(Moeda moeda) {
		double valorChips = 5;
		if (moeda.getValor() >= valorChips) {
			double troco = moeda.getValor() - valorChips;
			return "CHIPS - R$ " +  valorChips + "\n Troco - " + troco;
		} else {
			return this.proximoSlot.captura(moeda);
		}
	}
}
