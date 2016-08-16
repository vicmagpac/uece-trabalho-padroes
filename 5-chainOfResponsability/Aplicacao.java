class Aplicacao
{
    public static void main(String args[])
    {
        ISlot slot1 = new Slot1();
        ISlot slot2 = new Slot2();
        ISlot slotVazio = new SlotVazio();

        slot1.setProximo(slot2);
        slot2.setProximo(slotVazio);

        Moeda moeda = new Moeda(1.00);
        
        Produto refrigerante = new Produto("REFRIGERANTE", 1.00);
        Produto chips = new Produto("CHIPS", 2.50);
        System.out.println(slot1.captura(chips, moeda));
    }
}