
public class BonequinhaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "bonequinha";
    }

    @Override
    public void buildPreco() {
        item.preco = 2.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }
    
}
