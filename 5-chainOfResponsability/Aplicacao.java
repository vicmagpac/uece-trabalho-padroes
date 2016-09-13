class Aplicacao
{
    public static void main(String args[])
    {
        ISlot slot1 = new Slot1();
        ISlot slot2 = new Slot2();
        ISlot slotVazio = new SlotVazio();

	
        slot2.setProximo(slot1);
        slot1.setProximo(slotVazio);

        Moeda moeda = new Moeda(7.00);

        System.out.println(slot2.captura(moeda));
    }
}
