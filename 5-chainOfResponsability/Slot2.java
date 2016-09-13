
class Slot2 implements ISlot {
	private ISlot proximoSlot;

	public void setProximo(ISlot proximoSlot) {
		this.proximoSlot = proximoSlot;
	}

	public String captura(Moeda moeda) {
		double valorRefrigerante = 10;
		if (moeda.getValor() >= valorRefrigerante) {
			double troco = moeda.getValor() - valorRefrigerante;
			return "REFRIGERANTE - R$ " +  valorRefrigerante + "\n Troco - " + troco;
		} else {
			return this.proximoSlot.captura(moeda);
		}
	}
}
