
class SlotVazio implements ISlot {
	private ISlot proximoSlot;

	public void setProximo(ISlot proximoSlot) {
		// não implementar
	}

	public String captura(Moeda moeda) {
		return "Valor insuficiente \n Troco - " + moeda.getValor();	
	}
}