
public class Aplicacao {
	public static void main(String args[]) {
		
		Yogurt meuYogurt = new BaseDeMorango();
        System.out.println(meuYogurt.getNome() + " = "
                + meuYogurt.getPreco());

        meuYogurt = new Castanha(meuYogurt);
        System.out.println(meuYogurt.getNome() + " = "
                + meuYogurt.getPreco());

        meuYogurt = new CaldaDeChocolate(meuYogurt);
        System.out.println(meuYogurt.getNome() + " = "
                + meuYogurt.getPreco());
	}
}