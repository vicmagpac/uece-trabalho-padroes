class Aplicacao
{
    public static void main(String args[])
    {
        ISlot slot1 = new Slot1();
        ISlot slot2 = new Slot2();
        ISlot slotVazio = new SlotVazio();
	
        slot1.setProximo(slot2);
        slot2.setProximo(slotVazio);

        System.out.println(slot1.captura(new Moeda(10.00)));
    }
}
